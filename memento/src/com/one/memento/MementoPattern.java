package com.one.memento;

/**
 * @description: TODO
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
