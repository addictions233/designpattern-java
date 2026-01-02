package com.one.cglibproxy;

import com.one.staticproxy.UserDaoImpl;
import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void testCglibProxy() {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        System.out.println(userDaoImpl.getClass());

        ProxyFactory proxyFactory = new ProxyFactory(userDaoImpl);
        UserDaoImpl proxy = (UserDaoImpl)proxyFactory.getCglibProxy();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
