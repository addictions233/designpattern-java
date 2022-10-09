package com.one.dbroute;

import com.one.dbroute.proxy.OrderServiceStaticProxy;
import com.one.dbroute.service.IOrderService;
import com.one.dbroute.service.impl.orderServiceImpl;

/**
 * @author one
 * @description 测试类
 * @date 2022-8-6
 */
public class OrderServiceStaticProxyTest {
    public static void main(String[] args) {
        IOrderService orderService = new OrderServiceStaticProxy(new orderServiceImpl(new OrderDao()));
        orderService.createOrder(new Order());
    }
}
