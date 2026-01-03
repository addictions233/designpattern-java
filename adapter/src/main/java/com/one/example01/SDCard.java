package com.one.example01;

/**
 * 定义目标接口(Target): 当前业务系统所期待的接口, 它可以是接口或者抽象类
 */
public interface SDCard {

    /**
     * 读取SD卡的方法
     */
    String readSD();

    /**
     * 写入SD卡的方法
     */
    void writeSD(String msg);
}
