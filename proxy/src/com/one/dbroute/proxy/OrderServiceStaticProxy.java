package com.one.dbroute.proxy;

import com.one.dbroute.DynamicDatasourceEntity;
import com.one.dbroute.IOrderService;
import com.one.dbroute.Order;

import java.time.Year;

/**
 * @author one
 * @description 使用静态代理实现数据源的切换: 静态代理可以理解为组合复用
 * @date 2022-8-6
 */
public class OrderServiceStaticProxy implements IOrderService {
    private IOrderService orderService;

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
        orderService.createOrder(order);
        DynamicDatasourceEntity.restore();
        return 0;
    }

}
