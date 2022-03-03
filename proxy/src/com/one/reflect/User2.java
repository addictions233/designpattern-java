package com.one.reflect;

/**
 * @ClassName: User2
 * @Description: TODO
 * @Author: one
 * @Date: 2020/12/14
 */
public class User2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //只用有参构造器
    public User2(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void say(String name ,int age){
        System.out.println("my name is "+name+",age is "+age);
    }
}
