package com.one.filter;


import javax.servlet.http.*;

/**
 * @author one
 * 责任链中所有的校验器都需要继承本抽象类,重写doFilter()方法
 */
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

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }


    /**
     * 具体参数拦截逻辑,给子类去实现
     */
    public void filter(HttpServletRequest request, HttpServletResponse response) {
        // 执行模板抽象方法
        doFilter(request, response);

        // 判断责任中下一个元素是否为空
        if (getNextHandler() != null) {
            getNextHandler().filter(request, response);
        } else {
            System.out.println("filter chain success!");
        }
    }


    /**
     * 所有的校验器都必须重写doFilter()方法,在该方法中实现具体的校验逻辑
     *
     * @param request 请求
     * @param response 响应
     */
    public abstract void doFilter(HttpServletRequest request, HttpServletResponse response);

}