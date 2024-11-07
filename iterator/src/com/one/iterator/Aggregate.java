package com.one.iterator;

/**
 * @author one
 * 抽象的聚合
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    /**
     * 获取迭代器
     */
    Iterator getIterator();
}
