package com.one.state;

/**
 * @description: 具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A");
        // 状态切换
        context.setState(new ConcreteStateB());
    }
}
