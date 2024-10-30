package com.one.general;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author one
 * @description 获取享元对象的工厂: 享元模式又称轻量级模式, 是对象池的一种实现, 可以避免不停的创建和销毁多个对象, 消耗性能,
 * 共享细粒度对象, 将多个对同一对象的访问集中起来
 * @date 2024-10-30
 */
public class FlyweightFactory {

    /**
     * 将对象放入缓存池中, 以达到复用, 避免频繁的创建和销毁常用的对象
     */
    private static final Map<String, IFlyweight> CACHE_POOL = new ConcurrentHashMap<>();

    public static IFlyweight getFlyweight(String innerState) {
        if (!CACHE_POOL.containsKey(innerState)) {
            IFlyweight flyweight = new ConcreteFlyweight(innerState);
            CACHE_POOL.put(innerState, flyweight);
        }
        return CACHE_POOL.get(innerState);
    }
}
