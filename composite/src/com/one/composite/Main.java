package com.one.composite;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/07
 */
public class Main {

    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        // 树枝添加树叶节点作为子节点
        c0.add(leaf1);
        c1.add(leaf2);
        c1.add(leaf3);
        // 树枝添加树枝节点作为子节点
        c0.add(c1);
        // 调用树枝节点的业务方法, 访问其包含的所有子节点
        c0.operation();
    }
}
