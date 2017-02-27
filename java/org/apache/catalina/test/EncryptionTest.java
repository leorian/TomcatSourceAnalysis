package org.apache.catalina.test;

import java.security.Provider;
import java.security.Security;
import java.util.Map;

/**
 * Created by xiezg@317hu.com on 2017/2/27 0027.
 */
public class EncryptionTest {
    public static void main(String args[]) {
        for (Provider provider : Security.getProviders()) {
            //打印当前提供者信息
            System.out.println(provider);
            for (Map.Entry<Object, Object> entry : provider.entrySet()) {
                //打印提供者键值
                System.out.println("\t" + entry.getKey());

            }
        }
    }
}
