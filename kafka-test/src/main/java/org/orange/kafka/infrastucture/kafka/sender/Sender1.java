/**
 * ClassName: Sender1
 * Description:
 * date: 2022/6/25 11:29 上午
 *
 * @author licheng
 */
package org.orange.kafka.infrastucture.kafka.sender;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.orange.kafka.infrastucture.kafka.listener.SendResultListener1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sender1 {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @SneakyThrows
    public void sendSync(String topic, Object message) {
        kafkaTemplate.setProducerListener(new SendResultListener1());
        SendResult<String, Object> result = kafkaTemplate.send(topic, message).get();
        log.info(result.getRecordMetadata().toString());
    }
}
