package com.chain.example01;

public class Main {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        RequestData requestData = new RequestData("请求数据: ABCD");

        // 只用责任链中的第一个节点处理, 后续责任链中的节点都会执行
        handlerA.handle(requestData);
    }
}
