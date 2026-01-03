package com.one.example01;

/**
 * 使用对象适配器模式: 采用组合的方式持有Adaptee对象
 */
public class SDAdapterTF2 implements SDCard{

    private TFCard tfCard;

    public SDAdapterTF2(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF2 execute read..");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDAdapterTF2 execute write..");
        tfCard.writeTF(msg);
    }
}
