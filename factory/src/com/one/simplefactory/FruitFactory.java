package com.one.simplefactory;

import com.one.domain.Apple;
import com.one.domain.Banana;
import com.one.domain.Fruit;

/**
 * @author one
 *  静态工厂模式的核心就在工厂(creator)角色, 可以用该类的静态方法创建其它类的实例对象
 *      1,静态工厂的优点就是不需要知道每个类的构造方法,就能利用工厂角色的静态方法创建该类对象,
 *      2,这样就可以只让工厂角色曝光给用户,而实例类可以封装不对外界公开
 */
public class FruitFactory {

    public static final String APPLE = "apple";
    public static final String BANANA = "banana";

    /**
     * 第一中实现静态工厂模式的方式
     * @param fruitName 名称
     * @return Fruit 多态对象
     * @throws Exception 异常
     */
    public static Fruit getFruitInstance(String fruitName) throws Exception {
        if(APPLE.equalsIgnoreCase(fruitName)){
            return Apple.class.getDeclaredConstructor().newInstance();
        } else if(BANANA.equalsIgnoreCase(fruitName)){
            return Banana.class.getDeclaredConstructor().newInstance();
        } else{
            System.out.println("您输入的参数有误");
            return null;
        }


    }

    /**
     * 第二种实现静态工厂模式的方式
     * @param fruitName 名称
     * @return Fruit 多态对象
     * @throws Exception 异常信息
     */
    public static Fruit getFruitInstance2(String fruitName) throws Exception {
        Class<?> fruit = Class.forName(fruitName);
         return (Fruit) fruit.getConstructor().newInstance();
    }
}
