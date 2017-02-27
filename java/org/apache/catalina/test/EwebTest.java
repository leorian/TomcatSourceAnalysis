package org.apache.catalina.test;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/**
 * Created by xiezg@317hu.com on 2017/2/26 0026.
 */

public class EwebTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String url = "http://localhost:8080/picture-web/rest/pictureWeb/getTest";
        Pattern pattern = Pattern.compile("^[\\w\\W]*/rest/[\\w\\W]*$");
        System.out.println(pattern.matcher(url).matches());
        String ldappw = "{ssha}YzTtDNPwGccsxtvc625j7DJ1lC81J/9vIbn2KQ==";
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        if(!ldappw.startsWith("{SSHA}") && !ldappw.startsWith("{ssha}")) {
            if(ldappw.startsWith("{SHA}") || ldappw.startsWith("{sha}")) {
                ldappw = ldappw.substring(5);
            }
        } else {
            ldappw = ldappw.substring(6);
        }

        byte[] ldappwbyte = Base64.decode(ldappw);
        System.out.println(ldappwbyte.length);
    }


}
