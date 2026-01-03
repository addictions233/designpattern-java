package com.one.decorate.example01;

/**
 * 具体装饰（ConcreteDecorator）角色 : 它是抽象装饰类的子类,负责向构件添加新的职责.
 * 每一个具体装饰类都定义了一些新的行为,它可以调用在抽象装饰类中定义的方法,并可以增加新的方法用于扩充对象的行为.
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 调用原有的业务方法
        super.operation();
        // 调用新增的业务方法
        this.addBehavior();
    }

    public void addBehavior() {
        System.out.println("具体的装饰器A添加的功能执行了..");
    }
}
