package com.one.state;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}
