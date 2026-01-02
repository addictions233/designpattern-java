package com.one.example01;

import java.math.BigDecimal;

public class AliPay extends Pay {

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    /**
     * 支付宝渠道转账
     */
    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付划账开始......");

        boolean security = payMode.securityValidate(uId);
        System.out.println("支付宝渠道支付风险校验: " + uId + " , " + tradeId +" , " + security);

        if(!security){
            System.out.println("支付宝渠道支付划账失败!");
            return "500";
        }

        System.out.println("支付宝渠道划账成功! 金额: "+ amount);
        return "200";
    }
}
