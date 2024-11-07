package com.one.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
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
