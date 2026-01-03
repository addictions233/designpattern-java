package com.one.example01;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * 使用类适配器模式: 使用继承的方式来使用Adaptee
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF execute read..");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF execute write..");
        writeTF(msg);
    }
}
