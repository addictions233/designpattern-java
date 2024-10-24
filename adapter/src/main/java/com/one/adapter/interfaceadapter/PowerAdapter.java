package com.one.adapter.interfaceadapter;

/**
 * Created by Tom.
 */
public class PowerAdapter implements DC {
    /**
     * 遵循组合复用原则, 持有源角色(Adaptee), 而不是直接继承源角色
     */
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    public int output12V() {
        return 0;
    }

    public int output24V() {
        return 0;
    }

    public int output36V() {
        return 0;
    }
}
