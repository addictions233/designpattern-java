package com.one.example01;

/**
 * 定义迭代器接口
 * @param <E> 元素泛型
 */
public interface Iterator<E> {

    /**
     * 判断迭代器是否有下一个元素
     * @return boolean
     */
    boolean hasNext();

    /**
     * 游标往后移动一位, 并返回元素E
     * @return E
     */
    E next();
}
