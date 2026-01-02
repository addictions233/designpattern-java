package com.one.example01;

import java.math.BigDecimal;

/**
 * 定义抽象化角色(Abstraction): 主要负责定义出该角色的行为, 并包含一个对实现化对象的应用
 */
public abstract class Pay {

    /**
     * 桥接对象: 对实现化对象的引用
     */
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
