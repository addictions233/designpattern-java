package com.one.dbroute.service.impl;

import com.one.dbroute.Order;
import com.one.dbroute.OrderDao;
import com.one.dbroute.service.IOrderService;

/**
 * @author one
 * @description service实现类
 * @date 2022-8-6
 */
public class orderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public orderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public int createOrder(Order order) {
        return orderDao.insert(order);
    }
}
