package com.one.jdkproxy;

/**
 * @author one
 * @description 被代理对象:使用jdk的动态代理必须实现接口
 * @date 2022-8-10
 */
public class Girl implements Person{
    @Override
    public void findLove() {
        System.out.println("要求: 高富帅!");
    }
}
