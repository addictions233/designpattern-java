package com.one.template.example01;

public class ComcreteTemplateClassB extends AbstactTemplateClass{

    @Override
    public void step3() {
        System.out.println("在子类模板B中 --> 执行step3");
    }

    @Override
    public void step4() {
        System.out.println("在子类模板B中 --> 执行step4");
    }
}
