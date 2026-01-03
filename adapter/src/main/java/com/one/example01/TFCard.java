package com.one.example01;

/**
 * 适配者（Adaptee）类：适配者即被适配的角色,它是被访问和适配的现存组件库中的组件接口。
 * 定义TF卡接口
 */
public interface TFCard {

    String readTF();

    void writeTF(String msg);
}
