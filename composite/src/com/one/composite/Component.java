package com.one.composite;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/07
 */
public interface Component {

    void add (Component component);

    void remove(Component component);

    Component getChild(int index);

    void operation();
}
