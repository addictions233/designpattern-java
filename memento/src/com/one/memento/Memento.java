package com.one.memento;

/**
 * @description: 备忘录对象
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
