/**
 * ClassName: RedisTestApiImpl
 * Description:
 * date: 2022/6/11 10:26 下午
 *
 * @author licheng
 */
package org.orange.mongo.api;

import lombok.extern.slf4j.Slf4j;
import org.orange.mongo.app.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/mongo/test")
public class MongoTestApiImpl {

    @Resource
    private UserService userService;

    @RequestMapping("/test1")
    public String send() {
        userService.test1();
        return "called send success";
    }
}
