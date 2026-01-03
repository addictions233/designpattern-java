package com.one.example01;

/**
 * 定义电脑对象: 目前只支持读取SD卡
 */
public class Computer {

    public String readData(SDCard sdCard) {
       return sdCard.readSD();
    }

    public void writeData(SDCard sdCard, String msg) {
        sdCard.writeSD(msg);
    }
}
