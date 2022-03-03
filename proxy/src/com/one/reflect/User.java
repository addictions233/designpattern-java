package com.one.reflect;

/**
 * @ClassName: User
 * @Description: 演示反射机制创建对象的两种方式
 * @Author: one
 * @Date: 2020/12/14
 */
class User {
    private String name;
    private int age;

    //空参构造器
    public User(){

    }

    //成员方法
    public void say(){
        System.out.println("say hello.....");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
