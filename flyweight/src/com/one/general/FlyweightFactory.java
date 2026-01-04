package com.one.general;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author one
 * @description 获取享元对象的工厂: 享元模式(Flyweight Pattern)又称轻量级模式, 是对象池的一种实现,
 * 可以避免不停的创建和销毁多个对象,消耗性能, 共享细粒度对象, 将多个对同一对象的访问集中起来
 * @date 2024-10-30
 */
public class FlyweightFactory {

    /**
     * 存储享元对象的享元池
     * 将对象放入缓存池中, 以达到复用, 避免频繁的创建和销毁常用的对象
     */
    private static final Map<String, IFlyweight> CACHE_POOL = new ConcurrentHashMap<>();

    /**
     * 采用工厂模式获取享元对象, 共享的享元对象是单例的
     * @param innerState 内部状态
     * @return 享元对象
     */
    public static IFlyweight getFlyweight(String innerState) {
        // 用户获取享元对象先从享元池中获取, 有则返回, 没有则创建对象返回给用户
        if (!CACHE_POOL.containsKey(innerState)) {
            IFlyweight flyweight = new ConcreteFlyweight(innerState);
            CACHE_POOL.put(innerState, flyweight);
        }
        return CACHE_POOL.get(innerState);
    }
}
