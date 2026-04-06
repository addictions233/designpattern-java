package com.chain.example01;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 抽象的处理器
 */
public abstract class Handler {

    /**
     * 下一个节点的处理器
     */
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    /**
     * 子类需要实现的具体处理请求的方法
     * @param requestData 请求数据
     */
    public abstract void handle(RequestData requestData);
}
