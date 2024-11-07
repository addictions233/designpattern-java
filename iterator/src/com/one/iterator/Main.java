package com.one.iterator;

/**
 * @author one
 * @description TODO
 * @date 2024-11-7
 */
public class Main {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\n");
        }
        System.out.println("----------------------------");
        Object ob = it.first();
        System.out.println("First：" + ob.toString());
    }
}
