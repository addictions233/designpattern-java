package com.one.visitor;


/**
 * @author one
 * 元素接口
 */
public interface Element {

    void accept(Visitor visitor);

}
