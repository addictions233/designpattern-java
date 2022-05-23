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
        WeChat wechat = new WeChat("13163",100);
        //开启新线程, 用于微信话费充值
        new Thread(() -> wechat.pay()).start();

        //微信在进行花费充值的时候可以进行其他业务操作
        System.out.println("有朋友给你发了条消息");
        try {
            TimeUnit.SECONDS.sleep(3); //线程休眠3s
//            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("欢迎来到微信小程序!");
    }


}
