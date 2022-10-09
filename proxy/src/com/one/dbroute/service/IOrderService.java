package com.one.dbroute.service;

import com.one.dbroute.Order;

public interface IOrderService {
    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    public int createOrder(Order order);
}
