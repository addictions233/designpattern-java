package com.one.state;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}
