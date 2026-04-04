package com.one.template.example01;

/**
 * 模板方法模式: 在操作定义算法的框架, 将一些步骤推迟到子类中,模板方法让子类在不改变算法结构的情况下
 * 重新定义算法的某些步骤
 */
public abstract class AbstactTemplateClass {

    public void run(String key) {
        step1(key);
    }

    /**
     * 在抽象父类中定义模板方法
     */
    private void step1(String key) {
        System.out.println("在模板类中 --> 执行step1");
        if (step2(key)) {
            step3();
        } else {
            step4();
        }

        // 执行钩子函数
        hook();
    }

    private boolean step2(String key) {
        System.out.println("在模板类中 --> 执行step2");
        return "x".equals(key);
    }

    /**
     * 模板类中的抽象方法提供给子类来重写 (模板类的子类必须重写)
     */
    abstract void step3();

    /**
     * 模板类中的抽象方法提供给子类来重写 (模板类的子类必须重写)
     */
    abstract void step4();

    /**
     * 钩子函数, 提供子类扩展 模板类的子类可以重新, 也可以不重新
     */
    protected void hook() {
    }
}
