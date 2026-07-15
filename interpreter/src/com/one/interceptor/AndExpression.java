package com.one.interceptor;

/**
 * @description: 非终结符表达式类: 用来实现文法中与非终结符相关的操作
 * @author: wanjunjie
 * @date: 2024/11/04
 */
public class AndExpression implements AbstractExpression {

    private AbstractExpression city;

    private AbstractExpression person;

    public AndExpression(AbstractExpression city, AbstractExpression person) {
        this.city = city;
        this.person = person;
    }

    /**
     * 解释方法
     *
     * @param info
     */
    @Override
    public boolean intercept(String info) {
        String[] split = info.split("的");
        return city.intercept(split[0]) && person.intercept(split[1]);
    }
}
