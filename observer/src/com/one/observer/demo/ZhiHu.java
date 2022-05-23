package com.one.observer.demo;

import java.util.Observable;

/**
 * @ClassName: Student
 * @Description: 知乎问答类: 使用JDK提供的观察者的实现方式: 被观察者是继承java.util.Observable类
 * @Author: one
 * @Date: 2022/05/08
 */
public class ZhiHu extends Observable {
    /**
     * 单例模式创建知乎问答对象
     */
    private static ZhiHu zhiHu;


    private String name = "知乎问答";

    /**
     * 私有构造函数
     */
    private ZhiHu() {
    }

    /**
     * 提供静态方法获取实例对象
     *
     * @return 实例对象
     */
    public static ZhiHu getInstance() {
        if (zhiHu == null) {
            synchronized (ZhiHu.class) {
                if (zhiHu == null) {
                    zhiHu = new ZhiHu();
                    return zhiHu;
                }
            }
        }
        return zhiHu;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "在" + this.name + "提了一个问题,问题内容如下:\n" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
