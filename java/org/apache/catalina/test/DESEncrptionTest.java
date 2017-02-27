package org.apache.catalina.test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by xiezg@317hu.com on 2017/2/27 0027.
 */
public class DESEncrptionTest {
    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
//        AlgorithmParameterGenerator algorithmParameterGenerator = AlgorithmParameterGenerator.getInstance("MD5");
//        algorithmParameterGenerator.init(56);
//        AlgorithmParameters algorithmParameters = algorithmParameterGenerator.generateParameters();
//        byte[] b = algorithmParameters.getEncoded();
//        System.out.println(new BigInteger(b).toString());
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        keyGenerator.init(secureRandom);
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println(new String(secretKey.getEncoded()));
    }
}
