package com.one.state.simple;

/**
 * @description: 具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        // 当前状态的行为
        System.out.println("当前状态是B");
        // 切换到下一个状态
        context.setState(new ConcreteStateA());
    }
}
