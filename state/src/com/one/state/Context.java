package com.one.state;

/**
 * @description: 环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Context {

    private State state;


    /**
     * 定义上下文的初始化状态
     */
    public Context() {
        this.state = new ConcreteStateA();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 对请求进行处理
     */
    public void handler() {
        state.handle(this);
    }
}
