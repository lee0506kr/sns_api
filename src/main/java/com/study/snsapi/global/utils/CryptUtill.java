package com.study.snsapi.global.utils;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptUtill {
    public static String getSHA256(String str) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest localMesaageDigest = MessageDigest.getInstance("SHA-256");
        localMesaageDigest.update(str.getBytes("UTF-8"));
        byte[] encrypted = localMesaageDigest.digest();
        String base64Binary = DatatypeConverter.printBase64Binary(encrypted);
        return base64Binary;
    }
}
