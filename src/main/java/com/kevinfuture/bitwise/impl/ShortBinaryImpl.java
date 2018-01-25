package com.kevinfuture.bitwise.impl;

import com.kevinfuture.bitwise.IShortBinary;

/**
 *
 * @author kevin
 * @date 2018/1/25
 */
public class ShortBinaryImpl implements IShortBinary {
    @Override
    public byte[] short2Bytes(short org) throws Throwable {
        byte[] bytes = new byte[2];

        for(int i = 0; i < 2; i++){
            bytes[i]  = (byte)((int)((org >> i * 8 ) & 0xff));
            System.out.println("suffix: " + i + "this shortbit => byte = " + (byte)((int)((org >> i * 8 ) & 0xff)));
        }
        return bytes;
    }

    @Override
    public short bytes2Short(byte[] bytes) throws Throwable {
        short org = 0;

        int _this = 0;
        for(int i = 0; i < bytes.length; i ++){
            _this = (int)((bytes[i] & 0xff) << i * 8);
            org += _this;
            System.out.println("suffix : " + i + "this byte => short = "+ _this);
        }
        return org;
    }
}
