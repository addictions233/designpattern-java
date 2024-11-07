package com.one.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author one
 * @description TODO
 * @date 2024-11-7
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    /**
     * 获取迭代器
     */
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this.list);
    }
}
