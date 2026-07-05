package com.one.command.example01;

/**
 * 厨师类 -> Receiver 接受者角色 用来真正执行命令
 */
public class Chef {

    public void makeFood(int num, String foodName) {
        System.out.println(num + "份, " + foodName);
    }
}
