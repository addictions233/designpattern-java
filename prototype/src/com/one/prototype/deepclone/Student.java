package com.one.prototype.deepclone;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.lang.reflect.Method;

/**
 * @ClassName: Student
 * @Description: 拷贝对象
 * @Author: one
 * @Date: 2022/06/07
 */
public class Student implements Cloneable, Serializable {
    private String name;

    private Integer age;

    private Address address;

    public Student() {
    }

    public Student(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    /**
     * 重写clone()方法,在clone方法中实现深拷贝
     * @return 克隆对象
     * @throws CloneNotSupportedException 要使用clone方法必须实现Cloneable接口,否在抛出该异常
     */
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setAddress(new Address(this.address.getProvince(),this.address.getCity()));
        return student;
    }

    /**
     * 使用对象输入输出流实现序列化和反序列化
     * @return 克隆对象
     * @throws IOException 异常
     * @throws ClassNotFoundException 异常
     */
    public Student serializableDeepClone() throws IOException, ClassNotFoundException {
        // 使用字节数组替换序列化中的file对象
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object clone = ois.readObject();
        oos.close();
        bos.close();
        ois.close();
        bis.close();
        return (Student)clone;
    }

    /**
     * 使用Apache common lang3包下的SerializationUtils工具类实现深拷贝
     * @return 克隆对象
     */
    public Student serializationUtilsClone() {
        // 必须实现cloneable接口,其实方法底层与上面一样就是利用对象输入输出流
        Student clone = SerializationUtils.clone(this);
        return clone;
    }

    /**
     * 使用json的序列化和反序列化实现深拷贝
     * @return 克隆对象
     */
    public Student jsonDeepClone() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student clone = objectMapper.readValue(objectMapper.writeValueAsString(this), this.getClass());
        return clone;
    }
}
