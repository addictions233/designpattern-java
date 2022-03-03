package com.one.simplefactory;

/**
 *  静态工厂方法模式的核心就在工厂(creator)角色, 可以用该类的静态方法创建其它类的实例对象
 *      静态工厂的优点就是不需要知道每个类的构造方法,就能利用工厂角色的静态方法创建该类对象,
 *      这样就可以只让工厂角色曝光给用户,而实例类可以封装不对外界公开
 */
public class FruitFactory {
    // 第一中实现静态工厂模式的方式
    public static Fruit getFruitInstance(String fruitName) throws IllegalAccessException, InstantiationException {
        if("apple".equalsIgnoreCase(fruitName)){
            return Apple.class.newInstance();
        } else if("banana".equalsIgnoreCase(fruitName)){
            return Banana.class.newInstance();
        } else{
            System.out.println("您输入的参数有误");
            return null;
        }


    }
    //第二种实现静态工厂模式的方式
    public static Fruit getFruitInstance2(String fruitName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class fruit = Class.forName(fruitName);
         return (Fruit) fruit.newInstance();
    }
}
