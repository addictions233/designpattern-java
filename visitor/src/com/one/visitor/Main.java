package com.one.visitor;

/**
 * @author one
 * @description TODO
 * @date 2024-11-7
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.addElement(new ConcreteElement("苹果"));
        objectStructure.addElement(new ConcreteElement("香蕉"));
        objectStructure.addElement(new ConcreteElement("橘子"));
        objectStructure.addElement(new ConcreteElement("菠萝"));

        objectStructure.visitAll(new ConcreteVisitor());
    }
}
