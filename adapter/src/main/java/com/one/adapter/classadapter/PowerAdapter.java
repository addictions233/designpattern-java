package com.one.adapter.classadapter;

/**
 * 适配器一般包含三种角色:
 *  1. 目标角色(Target): 也就是我们期望的功能接口
 *  2. 原角色(Adaptee): 存在于系统中, 内容满足客户需求(需要转换), 但是接口不匹配的接口实例
 *  3. 适配器(Adapter): 将原角色(Adaptee)转换为目标角色(Target)的类实例
 */
public class PowerAdapter extends AC220 implements DC5 {
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
