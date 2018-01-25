package com.kevinfuture.bitwise;

/**
 * java中
 * 1 byte = 8 bit（一个字节占用八个比特位）
 * 基本数据类型中
 * long：8 byte = 8 * 8 bit（基本数据类型long占有八个字节，64个比特位）
 * @author kevin
 * @date 2018/1/25
 */
public interface ILongBinary {
    /**
     * long => bytes
     * **/
    byte[] long2Bytes(long org)throws Throwable;

    /**
     * bytes => long
     * **/
    long bytes2long(byte[] bytes)throws Throwable;
}
