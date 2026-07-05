package com.one.command.example01;

public class Client {

    public static void main(String[] args) {
        // 创建订单
        Order order1 = new Order();
        order1.setDiningTable(10); // 10号桌
        order1.getFoodMenu().put("佛跳墙", 2); // 点菜单
        order1.getFoodMenu().put("扬州炒饭", 3);

        Order order2 = new Order();
        order2.setDiningTable(15); // 15号桌
        order2.getFoodMenu().put("北京烤鸭", 1);
        order2.getFoodMenu().put("炭烤牛排", 4);

        // 创建 Receiver 接收者
        Chef receiver = new Chef();

        // 构建命令对象
        Command command1 = new OrderCommand(receiver, order1);
        Command command2 = new OrderCommand(receiver, order2);

        // 构建 Invoker 调用者对象
        Waiter waiter = new Waiter();
        waiter.addCommand(command1);
        waiter.addCommand(command2);

        // 使用 Invoker 真正的执行命令
        waiter.orderUp();

    }
}
