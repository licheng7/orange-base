/**
 * ClassName: Consumer1
 * Description:
 * date: 2022/6/25 10:47 上午
 *
 * @author licheng
 */
package org.orange.kafka.infrastucture.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.orange.kafka.infrastucture.kafka.message.OrangeTestMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer1 {

    @KafkaListener(topics = {"orange-test-topic"}, groupId = "orange-test-groupId")
    public void onMessage(ConsumerRecord<String, OrangeTestMessage> message) {
        message.headers().forEach(header -> {
            log.info(header.toString());
        });
        log.info("消费者接收到消息，${}", message.value().toString());
        if(true) {
            throw new RuntimeException("我就是故意抛出个异常");
        }
        log.info("我故意抛出了异常");
    }
}
