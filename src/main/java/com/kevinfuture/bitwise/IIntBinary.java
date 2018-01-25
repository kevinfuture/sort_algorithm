package com.kevinfuture.bitwise;

/**
 *
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
