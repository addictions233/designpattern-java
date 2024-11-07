package com.one.iterator;

import java.util.List;

/**
 * @author one
 * @description 实现迭代器接口
 * @date 2024-11-7
 */
public class ConcreteIterator implements Iterator{

    private List<Object> objectList;

    private int index = -1;

    public ConcreteIterator(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public Object first() {
        if (objectList == null) {
            return null;
        }
        index = 0;
        return objectList.get(index);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return objectList.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (objectList == null) {
            return false;
        }
        if (index < objectList.size() - 1) {
            return true;
        }
        return false;
    }
}
