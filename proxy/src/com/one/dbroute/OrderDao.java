package com.one.dbroute;

/**
 * @author one
 * @description TODO
 * @date 2022-8-6
 */
public class OrderDao {
    public Integer insert(Order order) {
        System.out.println("orderDao保存order对象成功");
        return 1;
    }
}
