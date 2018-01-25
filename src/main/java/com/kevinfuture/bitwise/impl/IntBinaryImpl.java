package com.kevinfuture.bitwise.impl;

import com.kevinfuture.bitwise.IIntBinary;

/**
 * java中
 * 1 byte = 8 bit（一个字节占用八个比特位）
 * 基本数据类型中
 * int：4 byte = 8 * 4 bit（基本数据类型int占有四个字节，32个比特位）
 * @author kevin
 * @date 2018/1/25
 */
public class IntBinaryImpl implements IIntBinary {
    @Override
    public byte[] int2Bytes(int org) throws Throwable {
        byte[] bytes = new byte[4];

        for(int i = 0; i < 4; i++){
            bytes[i]  = (byte)((int)((org >> i * 8 ) & 0xff));
            System.out.println("suffix: " + i + "this intbit => byte = " + (byte)((int)((org >> i * 8 ) & 0xff)));
        }
        return bytes;
    }

    @Override
    public int bytes2Int(byte[] bytes) throws Throwable {
        int org = 0;

        int _this = 0;
        for(int i = 0; i < bytes.length; i ++){
            _this = (int)((bytes[i] & 0xff) << i * 8);
            org += _this;
            System.out.println("suffix : " + i + "this byte => int = "+ _this);
        }
        return org;
    }
}
