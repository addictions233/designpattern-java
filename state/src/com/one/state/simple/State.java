package com.one.state.simple;

/**
 * @description: 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public abstract class State {

    public abstract void handle(Context context);
}
