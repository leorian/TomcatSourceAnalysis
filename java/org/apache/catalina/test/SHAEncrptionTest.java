package org.apache.catalina.test;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xiezg@317hu.com on 2017/2/27 0027.
 */
public class SHAEncrptionTest {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        //待做消息摘要算法的原始信息
        byte[] input = "sha".getBytes();
        //初始化MessageDigest对象，将使用SHA算法
        MessageDigest sha = MessageDigest.getInstance("SHA");
        //更新摘要信息
        sha.update(input);
        byte[] output = sha.digest();
        System.out.println(new String(output));
        System.out.println(new BASE64Encoder().encode(output));
    }
}
