package com.one.staticproxy;

import org.junit.Test;

/**
 * 测试静态代理
 */
public class StaticProxyTest {

    @Test
    public void testStaticProxy() {
        // 创建目标对象
        IUserDao target = new UserDaoImpl();

        // 创建代理对象
        IUserDao proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
