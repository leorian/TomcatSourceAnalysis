package org.apache.catalina.test;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xiezg@317hu.com on 2017/2/27 0027.
 */
public class MD5EncrptionTest1 {
    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
        //待做消息摘要的原始信息。
        byte[] input = "md5".getBytes();
        //初始化MessageDigest,将使用MD5算法。
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        //初始化DigestOutputStream
        DigestOutputStream digestOutputStream = new DigestOutputStream(new ByteArrayOutputStream(), messageDigest);
        //流输出
        digestOutputStream.write(input, 0, input.length);
        //获得摘要信息
        byte[] output = digestOutputStream.getMessageDigest().digest();
        //清空流
        digestOutputStream.flush();
        //关闭流
        digestOutputStream.close();

        System.out.println(new String(output));

    }
}
