package com.one.composite;

/**
 * @description: TODO
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

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子节点" + name + "被访问了...");
    }
}
