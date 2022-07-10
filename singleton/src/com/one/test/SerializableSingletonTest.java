package com.one.test;

import com.one.singleton.LazyInnerClassSingleton;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.nio.file.Files;

/**
 * @ClassName: SerializableSingletonTest
 * @Description: 使用序列化破坏单例模式,创建多个对象
 * @Author: one
 * @Date: 2022/05/28
 */
public class SerializableSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        // 将单例对象序列化到硬盘上
        FileOutputStream fos = new FileOutputStream("singleton/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.close();

        FileInputStream fis = new FileInputStream("singleton/a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        ois.close();
        System.out.println(instance);
        System.out.println(object);
        System.out.println(instance == object); // 输出false,说明序列化能破坏单例模式
    }
}
