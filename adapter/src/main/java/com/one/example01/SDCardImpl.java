package com.one.example01;

/**
 * 定义SD卡接口的实现类
 */
public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        String msg = "SD Card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD Card write data:" + msg);
    }
}
