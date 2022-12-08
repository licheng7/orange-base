package org.orange.web; /**
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
@PropertySource(value = {"classpath:application.yml"})
public class WebTestControllerApp {

    public static void main(String[] args) {
        log.info("web-test-controller启动");
        SpringApplication.run(WebTestControllerApp.class, args);
    }
}
