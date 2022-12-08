#!/bin/sh

set -e

echo "-------- maven 打包开始 --------"

PROJECT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )/.." && pwd )"
echo "-------- 项目的根路径为:$PROJECT_PATH --------"

cd $PROJECT_PATH
echo "-------- 开始执行编译 and 打包 --------"
mvn clean
mvn compile
mvn package -Dmaven.test.skip=true

JAR_PATH="$PROJECT_PATH/target"
echo "-------- jar包的存放路径为:$JAR_PATH --------"

#将jar包复制到/ops/docker目录
cp $JAR_PATH/*.jar ./ops/docker
echo "-------- 将jar包复制到/ops/docker目录 --------"

cd ./ops/docker
echo "-------- 当前目录为 $(pwd) --------"

#执行Dockerfile文件
docker build -t web_test_docker:1.0 .
echo "-------- docker镜像打包完成 --------"

#查看docker镜像
docker images

#登录私有仓库
DOCKER_REPOSITORIES="ccr.ccs.tencentyun.com"
docker login ${DOCKER_REPOSITORIES} -u 100002406311 -p licheng7
echo "-------- 登录私有仓库完成 --------"

#将镜像上传到docker私有仓库
APP_NAME="web-test"
init_version="0.0.1"

#获取旧的版本号
platformRepoTags=$(curl ${DOCKER_REPOSITORIES}/${APP_NAME}/tags/list |jq  ".tags" |awk -F',' '{print $NF}'|sed 's/[][]//'  |sed '/^$/d'|sed 's/\"//g')

docker push "${DOCKER_REPOSITORIES}/${APP_NAME}:${init_version}"
