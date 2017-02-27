package org.apache.catalina.test;

import sun.misc.BASE64Encoder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xiezg@317hu.com on 2017/2/27 0027.
 */
public class MD5EncrptionTest {
    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
        //待做消息摘要操作的原始信息
        byte[] input = "md5".getBytes();
        //初始化MessageDigest对象，将使用MD5算法
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        //构建DigestInputStream
        DigestInputStream digestInputStream = new DigestInputStream(new ByteArrayInputStream(input), messageDigest);
        digestInputStream.read(input, 0, input.length);
        byte[] output = digestInputStream.getMessageDigest().digest();
        System.out.println(new String(output));
        System.out.println(new BASE64Encoder().encode(output));

    }
}
