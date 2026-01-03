package com.one.example01;

/**
 * 定义适配者对象Adaptee:
 */
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String data = "TF Card reading data";
        return data;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF Card write data:" + msg);
    }
}
