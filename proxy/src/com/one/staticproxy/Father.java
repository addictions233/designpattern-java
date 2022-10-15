package com.one.staticproxy;

/**
 * 实现静态代理:
 *      1, 需要为源类编写一个代理类
 *      2, 代理类和源类实现同一个接口,重写被代理方法
 *      3, 代理对象持有源对象的引用
 * 静态代理不符合开闭原则
 */
public class Father implements Person {
    /**
     * 代理对象需持有源对象的引用
     */
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    /**
     * 父亲帮儿子找对象
     */
    @Override
    public void findLove() {
        before();
        this.person.findLove();
        after();
    }

    private void before() {
        System.out.println("物色对象");
    }

    private void after() {
        System.out.println("双方父母见面");
    }
}
