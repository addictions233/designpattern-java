package com.one.template.example01;

public class ConcreteTemplateClassA extends AbstactTemplateClass {

    /**
     * 具体的子类实现扩展方法
     */
    @Override
    void step3() {
        System.out.println("在子类模板A中 --> 执行step3");
    }

    @Override
    void step4() {
        System.out.println("在子类模板A中 --> 执行step4");
    }

    @Override
    protected void hook() {
        System.out.println("在子类模板A中 --> 执行hook函数");
    }
}
