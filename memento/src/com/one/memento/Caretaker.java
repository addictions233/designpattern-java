package com.one.memento;

/**
 * @description: 看护人（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Caretaker {

    /**
     * 对备忘录进行管理: 提供了备忘录对象的get和set方法
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
