package com.one.composite;

/**
 * @description: 树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 * @author: wanjunjie
 * @date: 2024/11/07
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        // 业务节点不能包含子节点, 所有是空实现
    }

    @Override
    public void remove(Component component) {
        // 业务节点不能包含子节点, 所有是空实现
    }

    @Override
    public Component getChild(int index) {
        // 业务节点不能包含子节点, 所有是空实现
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子节点" + name + "被访问了...");
    }
}
