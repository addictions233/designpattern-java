package com.one.state;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.handler();    //处理请求
        context.handler();
        context.handler();
        context.handler();
    }
}
