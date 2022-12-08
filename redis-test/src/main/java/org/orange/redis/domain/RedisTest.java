/**
 * ClassName: RedisTest
 * Description:
 * date: 2022/6/13 12:50 下午
 *
 * @author licheng
 */
package org.orange.redis.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RedisTest {

    public String test1() {
        log.info("RedisTest.test1 called, return 'i am RedisTest.test1'");
        return "i am RedisTest.test1";
    }
}
