package com.one.decorate.example01;

/**
 * 抽象装饰（Decorator）角色 ：它也是抽象构件类的子类,用于给具体构件增加职责,但是具体职责在其子类中实现.
 * 它维护了一个指向抽象构件对象的引用,通过该引用可以调用装饰之前构件对象的方法,并通过其子类扩展该方法,以达到装饰的目的.
 */
public class Decorator extends Component {

    /**
     * 维护一个对抽象构建对象的引用
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有的业务方法
        // 这里并没有实现真正的装饰, 而是提供一个统一的接口, 具体的装饰由子类去实现
        component.operation();
    }
}
