/**
 * ClassName: WebTestApiImpl
 * Description:
 * date: 2022/8/8 12:18 下午
 *
 * @author licheng
 */
package org.orange.web.api;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@Slf4j
@RestController
@RequestMapping("/web/test")
public class WebTestApiImpl {

    @SneakyThrows
    @RequestMapping("/print/test1")
    public String printTest1() {
        return "called test1 success";
    }

    @RequestMapping("/print/test2")
    public String printTest2() {
        return "called test2 success";
    }

    @RequestMapping("/print/ip")
    @SneakyThrows
    public String printIp() {
        String hostAddress = InetAddress.getLocalHost().getHostAddress();
        return "Ip 地址为："+hostAddress;
    }
}
