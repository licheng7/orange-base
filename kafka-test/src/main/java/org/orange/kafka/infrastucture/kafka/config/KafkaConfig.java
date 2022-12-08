/**
 * ClassName: KafkaConfig
 * Description:
 * date: 2022/6/23 5:47 下午
 *
 * @author licheng
 */
package org.orange.kafka.infrastucture.kafka.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.ConsumerRecordRecoverer;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.ErrorHandler;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.util.backoff.BackOff;
import org.springframework.util.backoff.FixedBackOff;

@Slf4j
@Data
@Configuration
public class KafkaConfig {

    @Bean
    @Primary
    public ErrorHandler kafkaErrorHandler(KafkaTemplate<?, ?> template) {
        ConsumerRecordRecoverer recoverer = new DeadLetterPublishingRecoverer(template);
        BackOff backOff = new FixedBackOff(10 * 1000L, 3L);
        return new SeekToCurrentErrorHandler(recoverer, backOff);
    }
}
