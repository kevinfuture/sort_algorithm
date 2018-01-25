package com.kevinfuture.bitwise;

/**
 * java中
 * 1 byte = 8 bit（一个字节占用八个比特位）
 * 基本数据类型中
 * int：4 byte = 8 * 4 bit（基本数据类型int占有四个字节，32个比特位）
 * @author kevin
 * @date 2018/1/25
 */
public interface IIntBinary {

    /**
     * int => bytes
     * **/
    byte[] int2Bytes(int org)throws Throwable;

    /**
     * bytes => int
     * **/
    int bytes2Int(byte[] bytes)throws Throwable;
}
