package com.one.visitor;

/**
 * @author one
 * 访问器接口
 */
public interface Visitor {

    /**
     * 访问器需要实现自己拿到元素对象之后如何操作的方法
     */
    void visit(Element element);
}
