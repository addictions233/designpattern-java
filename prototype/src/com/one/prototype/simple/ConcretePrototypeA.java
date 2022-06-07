package com.one.prototype.simple;

import java.util.List;

/**
 * @ClassName: ConcretePrototypeA
 * @Description: 具体可以拷贝的实体类
 * @Author: one
 * @Date: 2022/06/04
 */
public class ConcretePrototypeA implements Prototype {
    private String name;

    private Integer age;

    private List<String> hobbies;

    /**
     * 原型设计模式中的拷贝方法,类似于Object类中的clone()方法,子类需要重写该方法
     *
     * @return Prototype
     */
    @Override
    public Prototype clone() {
        ConcretePrototypeA clone = new ConcretePrototypeA();
        clone.setName(this.getName());
        clone.setAge(this.getAge());
        clone.setHobbies(this.getHobbies());
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
