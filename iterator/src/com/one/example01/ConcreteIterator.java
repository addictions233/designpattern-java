package com.one.example01;

import java.util.List;

public class ConcreteIterator<E> implements Iterator<E>{

    /**
     * 游标: 在集合中的位置指针
     */
    private int cursor;

    private List<E> list;

    public ConcreteIterator(List<E> list) {
        this.cursor = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public E next() {
        cursor++;
        return list.get(cursor-1);
    }
}
