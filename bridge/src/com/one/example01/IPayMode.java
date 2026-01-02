package com.one.example01;

/**
 * 定义实现化角色(Implementor): 定义实现化角色的接口, 包含角色必须的行为和属性, 并可扩展供抽象化角色调用
 */
public interface IPayMode {

    /**
     * 定义各种支付模式的校验方法
     * @param userId 用户ID
     * @return 校验结果
     */
    boolean securityValidate(String userId);
}
