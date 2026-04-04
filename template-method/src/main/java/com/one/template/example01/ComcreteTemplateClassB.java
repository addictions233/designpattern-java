package com.one.template.example01;

public class ComcreteTemplateClassB extends AbstactTemplateClass{

    @Override
    void step3() {
        System.out.println("在子类模板B中 --> 执行step3");
    }

    @Override
    void step4() {
        System.out.println("在子类模板B中 --> 执行step4");
    }
}
