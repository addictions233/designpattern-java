package com.one.interceptor;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 终结符表达式类
 * @author: wanjunjie
 * @date: 2024/11/04
 */
public class TerminalExpression implements AbstractExpression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    /**
     * 解释方法
     *
     * @param info
     */
    @Override
    public boolean intercept(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
