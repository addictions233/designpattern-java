package com.one.example01;

/**
 * 定义策略接口
 */
public interface Strategy {

    /**
     * 策略是否支持处理
     * @param key key
     * @return boolean
     */
    boolean support(String key);

    /**
     * 具体的策略方法实现
     */
    void algorithm();
}
