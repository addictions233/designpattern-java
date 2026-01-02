package com.one.example01;

/**
 * 定义具体实现化角色(Concrete Implementor): 给出实现化角色的具体实现
 */
public class PayFingerprintMode implements IPayMode{

    @Override
    public boolean securityValidate(String userId) {
        System.out.println("指纹支付,风控校验-指纹信息");
        return true;
    }
}
