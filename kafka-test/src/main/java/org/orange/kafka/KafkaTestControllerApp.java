package org.orange.kafka; /**
 * ClassName: App
 * Description:
 * date: 2021/10/21 2:44 下午
 *
 * @author licheng
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@SpringBootApplication(scanBasePackages = {"org.orange"})
@PropertySource(value = {"classpath:kafka.yml", "classpath:application.yml"})
public class KafkaTestControllerApp {

    public static void main(String[] args) {
        log.info("kafka-test-controller启动");
        SpringApplication.run(KafkaTestControllerApp.class, args);
    }
}
