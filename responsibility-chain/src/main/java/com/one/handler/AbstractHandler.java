package com.one.handler;


import javax.servlet.http.*;

public abstract class AbstractHandler {

    /**
     * 责任链中的下一个对象
     */
    private AbstractHandler nextHandler;

    /**
     * 责任链的下一个对象
     */
    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 具体参数拦截逻辑,给子类去实现
     */
    public void filter(HttpServletRequest request, HttpServletResponse response) {
        doFilter(request, response);
        if (getNextHandler() != null) {
            getNextHandler().filter(request, response);
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void doFilter(HttpServletRequest request, HttpServletResponse response);

}