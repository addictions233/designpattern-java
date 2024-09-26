package com.one.prototype.simple;

import com.one.prototype.simple.ConcretePrototypeA;
import com.one.prototype.simple.Prototype;
import com.one.prototype.simple.PrototypeCloneUtil;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * @ClassName: PrototypeTest
 * @Description: 测试简单的原型设计模式
 * @Author: one
 * @Date: 2022/06/04
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("张三");
        concretePrototypeA.setAge(23);
        concretePrototypeA.setHobbies(new ArrayList<String>() {
            {
                add("唱");
                add("跳");
                add("篮球");
            }
        });
        ConcretePrototypeA clonePrototype = (ConcretePrototypeA)PrototypeCloneUtil.clonePrototype(concretePrototypeA);
        System.out.println(concretePrototypeA);
        System.out.println(clonePrototype);
        // 比较两个对象的地址值
        System.out.println("克隆对象地址值比较:" + (concretePrototypeA == clonePrototype)); // 返回false
        // 比较两个对象中的hobbies属性的地址值, 返回true表示为浅拷贝
        System.out.println("克隆对象的属性地址值比较:" + (concretePrototypeA.getHobbies() == clonePrototype.getHobbies())); // 返回true
    }
}
