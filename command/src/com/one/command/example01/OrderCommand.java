package com.one.command.example01;

import java.util.Map;

/**
 * 具体的订单命令
 */
public class OrderCommand implements Command{

    /**
     * 具体的命令中持有 Receiver 接收者
     */
    private Chef receiver;

    /**
     * 命令中包含订单
     */
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.receiver = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单: ");
        for (Map.Entry<String, Integer> entry : order.getFoodMenu().entrySet()) {
            receiver.makeFood(entry.getValue(), entry.getKey());
        }

        System.out.println(order.getDiningTable() + "桌的菜品已经上齐了!");
    }
}
