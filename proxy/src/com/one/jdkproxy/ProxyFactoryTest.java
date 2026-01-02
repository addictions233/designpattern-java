package com.one.jdkproxy;

import com.one.staticproxy.IUserDao;
import com.one.staticproxy.UserDaoImpl;
import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void testProxyFactory() {
        IUserDao userDao = new UserDaoImpl();

        // 生成代理对象
        IUserDao proxy = (IUserDao)new ProxyFactory(userDao).getProxy();
        proxy.save();
    }
}
