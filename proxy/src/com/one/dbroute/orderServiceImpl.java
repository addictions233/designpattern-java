package com.one.dbroute;

/**
 * @author one
 * @description service实现类
 * @date 2022-8-6
 */
public class orderServiceImpl implements IOrderService{
    private OrderDao orderDao;

    public orderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public int createOrder(Order order) {
        return orderDao.insert(order);
    }
}
