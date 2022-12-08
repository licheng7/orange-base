/**
 * ClassName: BitmapTest
 * Description:
 * date: 2022/11/2 2:19 下午
 *
 * @author licheng
 */
package org.orange.all;

import org.junit.jupiter.api.Test;

public class NumberTest {

    /**
     * 十进制转二进制
     */
    @Test
    public void test1() {
        String result = Long.toBinaryString(Long.MAX_VALUE);
        System.out.println("十进制转二进制，结果："+result);
    }

    /**
     * 二进制转十进制
     */
    @Test
    public int test2() {
        int result = Integer.parseInt("101010", 2);
        System.out.println("二进制转十进制，结果："+result);
        return result;
    }

    /**
     * 两个二进制数取并集
     */
    @Test
    public void test3() {
        String a = "10101010101010101010101010101010101010101010";
        String b = "10101010111010101011101010101110101010111010";

        byte[] bytesA = a.getBytes();
        byte[] bytesB = b.getBytes();

        int c = Integer.parseInt(a, 2) ^ Integer.parseInt(b, 2);
        System.out.println(c);
    }
}
