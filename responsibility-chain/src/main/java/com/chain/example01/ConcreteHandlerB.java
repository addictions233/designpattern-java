package com.chain.example01;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handle(RequestData requestData) {
        System.out.println("HandlerB 执行代码逻辑! 处理:" + requestData.getData());
        // 进行请求处理
        requestData.setData(requestData.getData().replace("B", ""));

        // 判断下一个节点是否有值
        if (this.hasNext()) {
            this.getNext().handle(requestData);
        } else {
            System.out.println("执行结束!");
        }
    }
}
