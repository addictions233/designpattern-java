package com.one.prototype.deepclone;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * @ClassName: DeepCloneTest
 * @Description: 深拷贝的几种实现方式
 * @Author: one
 * @Date: 2022/06/07
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student prototype = new Student("张三",23,new Address("湖北省","武汉市"));
        // 1,使用clone方法实现深拷贝
//        Student clone = prototype.clone();
        // 2,使用对象流的序列化和反序列化实现深拷贝
//        Student clone = prototype.serializableDeepClone();
        // 3,使用json的序列化和反序列化
//        Student clone = prototype.jsonDeepClone(); // 少了依赖
        // 4,使用apache工具包中的SerializableUtil中工具类实现深拷贝
        Student clone = prototype.serializationUtilsClone();
        // 调用clone方法的类必须实现Cloneable接口
        System.out.println(prototype);
        System.out.println(clone);
        System.out.println(prototype.getAddress() == clone.getAddress()); // 打印false表示深拷贝
    }
}
