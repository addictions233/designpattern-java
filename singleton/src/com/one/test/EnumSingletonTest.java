package com.one.test;

import com.one.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName: EnumSingletonTest
 * @Description: 枚举式单例的测试
 * @Author: one
 * @Date: 2022/05/29
 */
public class EnumSingletonTest {
    public static void main(String[] args) throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton/object.txt"));
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton/object.txt"));
        EnumSingleton instance2 = (EnumSingleton)ois.readObject();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2); // 输出:true,表面两个对象是同一个
        oos.close();
        ois.close();
    }
}
