package com.one.register;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: ContainerSingleton
 * @Description: 注册式单例: 容器实现  IOC容器就是采用这种方式实现bean对象的单例
 * @Author: one
 * @Date: 2022/05/28
 */
public class ContainerSingleton {
    private static final ConcurrentHashMap<String, Object> IOC = new ConcurrentHashMap<>();

    private ContainerSingleton() {

    }

    /**
     * 对外提供获取bean对象实例的方法
     * @param className bean对象名称
     * @return Object
     * @throws Exception
     */
    public static Object getBean(String className) throws Exception {
        if (className == null) {
            return null;
        }
        if (IOC.containsKey(className)) {
            return IOC.get(className);
        }
        synchronized (IOC) {
            // 双重锁校验
            if (IOC.containsKey(className)) {
                return IOC.get(className);
            }
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object instance = constructor.newInstance();
            IOC.put(className, instance);
            return instance;
        }
    }

}
