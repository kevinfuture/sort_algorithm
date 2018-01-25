package com.kevinfuture.bitwise.impl;

import com.kevinfuture.bitwise.ILongBinary;

/**
 *
 * @author kevin
 * @date 2018/1/25
 */
public class LongBinaryImpl implements ILongBinary {


    @Override
    public byte[] long2Bytes(long org) throws Throwable {
        System.out.println("原始二进制数据："+Long.toBinaryString(org));
        byte[] bytes = new byte[8];

        for(int i = 0; i < 8; i++){
            bytes[i]  = (byte)((int)((org >> i * 8 ) & 0xff));
            System.out.println("suffix: " + i + "this longbit => byte = " + (byte)((int)((org >> i * 8 ) & 0xff)));
        }
        return bytes;
    }

    @Override
    public long bytes2long(byte[] bytes) throws Throwable {
        long org = 0;

        int _this = 0;
        for(int i = 0; i < bytes.length; i ++){
            _this = (int)((bytes[i] & 0xff) << i * 8);
            org += _this;
            System.out.println("suffix : " + i + "this byte => long = "+ _this);
        }
        return org;
    }
}
