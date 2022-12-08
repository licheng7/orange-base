/**
 * ClassName: SendResultListener1
 * Description:
 * date: 2022/6/25 6:01 下午
 *
 * @author licheng
 */
package org.orange.kafka.infrastucture.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SendResultListener1 implements ProducerListener {

    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("成功发送消息${}", producerRecord.toString());
    }

    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {
        log.info("发送消息失败${}", producerRecord.toString());
    }
}
