/**
 * ClassName: ShellTestControllerApp
 * Description:
 * date: 2022/11/1 1:52 下午
 *
 * @author licheng
 */
package org.orange.shell;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@SpringBootApplication(scanBasePackages = {"org.orange"})
@PropertySource(value = {"classpath:application.yml"})
public class ShellTestControllerApp {

    public static void main(String[] args) {
        log.info("shell-test-controller启动");
        SpringApplication.run(ShellTestControllerApp.class, args);
    }
}
