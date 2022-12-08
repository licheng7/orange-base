/**
 * ClassName: ShellUtil
 * Description:
 * date: 2022/11/1 1:54 下午
 *
 * @author licheng
 */
package org.orange.shell.infrastucture.shell;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.*;

@Slf4j
public class ShellUtil {

    public String callOne4Script(String scriptPath) {

        if(StringUtils.isEmpty(scriptPath)) {
            throw new RuntimeException("脚本路径为空");
        }

        try {
            Process exec = Runtime.getRuntime().exec(scriptPath);

            InputStream inputStream = exec.getInputStream();
            byte[] getData = readInputStream(inputStream);
            inputStream.read(getData);
            String str = new String(getData);
            log.info(str);
        } catch (IOException e) {
            throw new RuntimeException("执行脚本失败", e);
        }

        return "call success";
    }

    public String callOne4Command(String command) {

        if(StringUtils.isEmpty(command)) {
            throw new RuntimeException("脚本路径为空");
        }

        try {
            Process exec = Runtime.getRuntime().exec(command);

            InputStream inputStream = exec.getInputStream();
            byte[] getData = readInputStream(inputStream);
            inputStream.read(getData);
            String str = new String(getData);
            log.info(str);
        } catch (IOException e) {
            throw new RuntimeException("执行脚本失败", e);
        }

        return "call success";
    }

    private static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }
}
