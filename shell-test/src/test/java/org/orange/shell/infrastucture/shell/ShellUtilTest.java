package org.orange.shell.infrastucture.shell;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ShellUtilTest {

    @Test
    void callOne4Script() {
        log.info(new ShellUtil().callOne4Script(
                System.getProperty("user.dir")+"/src/main/resources/shell/Test1.sh"));
    }

    @Test
    void callOne4Command() {
        log.info(new ShellUtil().callOne4Command("ls -al"));
    }
}