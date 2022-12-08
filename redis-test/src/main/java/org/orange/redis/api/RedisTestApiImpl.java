/**
 * ClassName: RedisTestApiImpl
 * Description:
 * date: 2022/6/11 10:26 下午
 *
 * @author licheng
 */
package org.orange.redis.api;

import lombok.extern.slf4j.Slf4j;
import org.orange.redis.application.RedisTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/redis/test")
public class RedisTestApiImpl {

    @Resource
    private RedisTestService redisTestService;

    @RequestMapping("/test1")
    public String test1() {
        String result = redisTestService.test1("redis-test1-param1");
        log.info("result=${}", result);
        return "called test1 success";
    }

    @RequestMapping("/test2")
    public String test2() {
        String result = redisTestService.test2("redis-test1-param1");
        log.info("result=${}", result);
        return "called test2 success";
    }
}
