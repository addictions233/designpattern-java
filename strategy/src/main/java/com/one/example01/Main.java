package com.one.example01;

public class Main {

    public static void main(String[] args) {
        // 构建上下文对象
        Context context = new Context();

        // 调用具体的策略对象来处理任务
        context.algorithm("x");
        context.algorithm("y");
    }
}
