package com.one.dbroute;

import com.one.dbroute.proxy.OrderServiceDynamicProxy;
import com.one.dbroute.proxy.OrderServiceStaticProxy;
import com.one.dbroute.service.IOrderService;
import com.one.dbroute.service.impl.orderServiceImpl;

/**
 * @author one
 * @description 测试动态代理
 * @date 2022-10-12
 */
public class OrderServiceDynamicProxyTest {
    public static void main(String[] args) {
        // 获取动态代理对象
        IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getProxy(new orderServiceImpl(new OrderDao()));
        // 动态代理对象调用接口中的切面方法,本质上是调用InvocationHandler中的invoke方法
        orderService.createOrder(new Order());
    }
}
