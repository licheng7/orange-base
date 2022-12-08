/**
 * ClassName: RedisTestServiceImpl
 * Description:
 * date: 2022/6/12 1:16 下午
 *
 * @author licheng
 */
package org.orange.redis.application.impl;

import lombok.extern.slf4j.Slf4j;
import org.orange.redis.domain.RedisTest;
import org.orange.redis.application.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RedisTestServiceImpl implements RedisTestService {

    @Autowired
    private RedisTest redisTest;

    @Autowired
    private RedisTemplate redisTemplate;

    @Cacheable(value = "redis-test-value", key = "#param")
    @Override
    public String test1(String param) {
        log.info("called RedisTestServiceImpl.test1");
        String result = redisTest.test1();
        return result;
    }

    @Override
    public String test2(String param) {
        log.info("called RedisTestServiceImpl.test2");
        String result = (String) redisTemplate.opsForValue().get("redis-test-value::"+param);
        return result;
    }


}
