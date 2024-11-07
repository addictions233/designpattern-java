package com.one.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author one
 * @description TODO
 * @date 2024-11-7
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void addElement(Element element) {
        this.list.add(element);
    }

    public void visitAll(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

}
