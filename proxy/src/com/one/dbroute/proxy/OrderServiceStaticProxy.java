package com.one.dbroute.proxy;

import com.one.dbroute.DynamicDatasourceEntity;
import com.one.dbroute.service.IOrderService;
import com.one.dbroute.Order;

import java.time.Year;

/**
 * @author one
 * @description 使用静态代理实现数据源的切换: 静态代理可以理解为组合复用
 * @date 2022-8-6
 */
public class OrderServiceStaticProxy implements IOrderService {
    /**
     * 被代理的对象
     */
    private IOrderService orderService;

    /**
     * 以构造器的方式注入被代理的对象
     * @param orderService 被代理对象
     */
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @Override
    public int createOrder(Order order) {
        int year = Year.now().getValue();
        String dbRoute= "db_" + year;
        DynamicDatasourceEntity.set(dbRoute);
        System.out.println("使用了数据源:" + dbRoute);
        int result = orderService.createOrder(order);
        DynamicDatasourceEntity.restore();
        return result;
    }

}
