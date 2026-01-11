package com.one.simplefactory;

import com.one.domain.Apple;
import com.one.domain.Banana;
import com.one.domain.Fruit;

/**
 * @author one
 * 简单工厂模式: 负责创建所有实例, 提供外界调用创建实例的方法, 创建所需的对象
 * 静态工厂方法的核心就在工厂(creator)角色, 可以用该类的静态方法创建其它类的实例对象
 *      1,静态工厂的优点就是不需要知道每个类的构造方法,就能利用工厂角色的静态方法创建该类对象,
 *      2,这样就可以只让工厂角色曝光给用户,而实例类可以封装不对外界公开
 */
public class FruitFactory {

    public static final String APPLE = "apple";
    public static final String BANANA = "banana";

    /**
     * 第一种实现: 简单工厂模式: 适合创建简单对象,不用关系对象的内部创建原则
     *      优点: 只需要传入一个正确的参数, 就可以获取你所需要的对象, 而无须知道其创建细节
     *      缺点: 1,只适合创建少量不同类型的对象,如果对象多了, 需要写的if..else...会增多
     *            2, 违背了开闭原则,可扩展性差,如果要扩展新的类型的对象,需要修改原有的代码
     *            3, 无法为创建对象传递参数
     *            4, 违背了单一职责原则,一个工厂类中创建了多种类型的实例对象: apple, banana,..
     * @param fruitName 名称
     * @return Fruit 多态对象
     * @throws Exception 异常
     */
    public static Fruit getFruitInstance(String fruitName) throws Exception {
        // 通过if else条件判断来创建对象
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
     * 第二种实现: 静态工厂模式
     * @param fruitName 名称
     * @return Fruit 多态对象
     * @throws Exception 异常信息
     */
    public static Fruit getFruitInstance2(String fruitName) throws Exception {
        // 使用静态工厂一定程度上满足可开闭原则, 当有新的fruit实现类对象需要创建时, 不需要修改这里
        Class<?> fruit = Class.forName(fruitName);
         return (Fruit) fruit.getConstructor().newInstance();
    }
}
