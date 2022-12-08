FROM java:8

MAINTAINER licheng7

ADD *.jar "/app.jar"

#RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8704

CMD java -jar "/app.jar"

#Dockerfile打包命令: docker build -t web_test:1.0.1 .
#打tag: docker tag ba5111c2cacb ccr.ccs.tencentyun.com/orange-test/web-test:1.0.1
#push到hub: docker push ccr.ccs.tencentyun.com/orange-test/web-test:1.0.1