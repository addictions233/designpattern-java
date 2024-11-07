package com.one.memento;

/**
 * @description: 备忘录（Memento）模式的定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class MementoPattern {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("SO");
        System.out.println("初始化状态:" + originator.getState());
        // 创建备忘录
        caretaker.setMemento(originator.createMemento());
        originator.setState("S1");
        System.out.println("新的状态:" + originator.getState());
        // 按照备忘录恢复
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态:" + originator.getState());

    }
}
