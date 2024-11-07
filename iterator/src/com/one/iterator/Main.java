package com.one.iterator;

/**
 * @author one
 * @description TODO
 * @date 2024-11-7
 */
public class Main {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("中山大学");
        aggregate.add("华南理工");
        aggregate.add("韶关学院");
        System.out.print("聚合的内容有：");
        // 获取迭代器
        Iterator iterator = aggregate.getIterator();
        // 使用迭代器遍历所有的元素
        while (iterator.hasNext()) {
            Object ob = iterator.next();
            System.out.print(ob.toString() + "\n");
        }
        System.out.println("----------------------------");
        // 使用迭代器获取第一个集合元素
        Object ob = iterator.first();
        System.out.println("First：" + ob.toString());
    }
}
