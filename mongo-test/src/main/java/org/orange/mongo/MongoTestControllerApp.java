package org.orange.mongo; /**
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
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Slf4j
@SpringBootApplication(scanBasePackages = {"org.orange"})
@PropertySource(value = {"classpath:application.yml"})
public class MongoTestControllerApp {

    public static void main(String[] args) {
        log.info("mongoDB-test-controller启动");
        SpringApplication.run(MongoTestControllerApp.class, args);
    }
}
