package com.kevinfuture.bitwise;

/**
 * java中
 * 1 byte = 8 bit（一个字节占用八个比特位）
 * 基本数据类型中
 * short：2 byte = 8 * 2 bit（基本数据类型short占有两个字节，162个比特位）
 * @author kevin
 * @date 2018/1/25
 */
public interface IShortBinary {
    /**
     * short => bytes
     * **/
    byte[] short2Bytes(short org)throws Throwable;

    /**
     * bytes => short
     * **/
    short bytes2Short(byte[] bytes)throws Throwable;
}
