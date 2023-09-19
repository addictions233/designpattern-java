package com.one.abstractfactory;

/**
 * @ClassName: JavaNote
 * @Description: 具体产品: 具体产品是为了在具体工厂中创建对象, 并提供外界使用
 * @Author: one
 * @Date: 2022/05/26
 */
public class JavaNote implements INote {
    @Override
    public void takeNote() {
        System.out.println("做java笔记");
    }
}
