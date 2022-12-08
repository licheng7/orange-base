/**
 * ClassName: RedisTestApiImpl
 * Description:
 * date: 2022/6/11 10:26 下午
 *
 * @author licheng
 */
package org.orange.kafka.api;

import lombok.extern.slf4j.Slf4j;
import org.orange.kafka.infrastucture.kafka.message.OrangeTestMessage;
import org.orange.kafka.infrastucture.kafka.sender.Sender1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;

@Slf4j
@RestController
@RequestMapping("/kafka/test")
public class KafkaTestApiImpl {

    @Resource
    private Sender1 sender;

    @RequestMapping("/send")
    public String send() {
        OrangeTestMessage orangeTestMessage = new OrangeTestMessage(1L, "name", Collections.emptyList());
        sender.sendSync("orange-test-topic", orangeTestMessage);
        return "called send success";
    }
}
