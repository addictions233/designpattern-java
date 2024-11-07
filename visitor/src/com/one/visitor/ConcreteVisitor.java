package com.one.visitor;

/**
 * @author one
 * @description 具体的访问器实现
 * @date 2024-11-7
 */
public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(Element element) {
        System.out.println("访问到元素:" + element.toString());
    }
}
