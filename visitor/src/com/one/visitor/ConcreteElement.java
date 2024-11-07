package com.one.visitor;

/**
 * @author one
 * @description 具体的元素实现
 * @date 2024-11-7
 */
public class ConcreteElement implements Element {

    private String name;

    public ConcreteElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        // 调用访问器的访问方法
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
