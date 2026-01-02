package com.one.jdkproxy;

import com.one.staticproxy.IUserDao;
import com.one.staticproxy.UserDaoImpl;
import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void testProxyFactory() {
        IUserDao userDao = new UserDaoImpl();
        System.out.println(userDao.getClass());
        // 生成代理对象
        IUserDao proxy = (IUserDao)new ProxyFactory(userDao).getProxy();
        System.out.println(proxy.getClass());
        proxy.save();
        System.out.println("==================================");
        // 代理逻辑对于所有的代理对象都生效
        proxy.toString();
    }
}
