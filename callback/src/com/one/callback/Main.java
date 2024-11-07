package com.one.callback;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Main
 * @Description: 测试回调机制的测试类
 * @Author: one
 * @Date: 2020/12/04
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("今日微信热点新闻....");
        // 在回调模式中，一个可执行的代码块（回调函数）被传递给其他代码，以便在特定事件发生时被调用
        // 回调函数通常由调用方提供，用于定义在特定事件发生时应该执行的操作
        WeChat wechat = new WeChat("12580", 100, new Callback() {
            @Override
            public void call() {
                System.out.println("充值成功后回调通知..");
            }
        });
        //开启新线程, 用于微信话费充值
        wechat.pay();

        //微信在进行花费充值的时候可以进行其他业务操作
        System.out.println("有朋友给你发了条消息");
        try {
            TimeUnit.SECONDS.sleep(1); //线程休眠3s
//            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("欢迎来到微信小程序!");
    }


}
