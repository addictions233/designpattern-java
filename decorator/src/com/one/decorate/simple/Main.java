package com.one.decorate.simple;

/**
 * 测试类型
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class Main {
	public static void main(String[] args) {
		Decorator decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
		decoratorA.operation();
		System.out.println("-------------------------------------------");
		Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
		decoratorB.operation();


	}
}
