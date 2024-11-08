package com.one.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 * @author: wanjunjie
 * @date: 2024/11/07
 */
public class Composite implements Component{

    private List<Component> childList = new ArrayList<>();

    @Override
    public void add(Component component) {
        childList.add(component);
    }

    @Override
    public void remove(Component component) {
        childList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return childList.get(index);
    }

    @Override
    public void operation() {
        for (Component component : childList) {
            component.operation();
        }
    }
}
