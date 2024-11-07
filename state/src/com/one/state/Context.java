package com.one.state;

/**
 * @description: 上下文
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
