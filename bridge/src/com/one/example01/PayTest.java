package com.one.example01;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PayTest {

    @Test
    public void testPay() {
        // 支付宝渠道, 采用面部识别
        Pay aliPay = new AliPay(new PayFaceMode());
        aliPay.transfer("ali_001", "tx100200", new BigDecimal(100));

        System.out.println("=====================================");

        // 微信支付渠道, 采用指纹识别
        Pay wechatPay = new WechatPay(new PayFingerprintMode());
        wechatPay.transfer("wx_005", "tc203042", new BigDecimal(200));
    }
}
