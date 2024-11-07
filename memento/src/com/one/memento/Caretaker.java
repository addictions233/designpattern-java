package com.one.memento;

/**
 * @description: 管理者
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
