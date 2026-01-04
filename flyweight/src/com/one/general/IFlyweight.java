package com.one.general;

/**
 * @author one
 * 享元模式的抽象接口
 */
public interface IFlyweight {

    /***
     * 参数传递的是外部状态
     * @param externalState 外部状态
     */
    void operate(String externalState);
}
