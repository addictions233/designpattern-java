package com.one.interceptor;

/**
 * @description: 抽象表达式
 * @author: wanjunjie
 * @date: 2024/11/04
 */
public interface AbstractExpression {

    /**
     * 解释方法
     */
    boolean intercept(String info);
}
