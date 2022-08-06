package com.one.dbroute;

/**
 * @author one
 * @description 订单类
 * @date 2022-8-6
 */
public class Order {
    private Object orderInfo;

    private Long createTime;

    private String orderId;

    public Order() {
    }

    public Order(Object orderInfo, Long createTime, String orderId) {
        this.orderInfo = orderInfo;
        this.createTime = createTime;
        this.orderId = orderId;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
