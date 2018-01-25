package com.kevinfuture.util;

/**
 * Created by kevin on 2018/1/25.
 */
public class Bytes2TypeUtil {

    public static <T> T bytes2Type(byte[] bytes, Class<T> t) throws  Throwable{
        int org = 0;

        int _this = 0;
        for(int i = 0; i < bytes.length; i ++){
            _this = (int)((bytes[i] & 0xff) << i * 8);
            org += _this;
            System.out.println("suffix : " + i + "this byte => long = "+ _this);
        }
        return null;
    }
}
