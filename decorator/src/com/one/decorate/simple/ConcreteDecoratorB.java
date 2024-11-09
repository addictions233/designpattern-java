package com.one.decorate.simple;

/**
 * 具体的装饰实现类B
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		addBehavior();
		System.out.println("具体的装饰对象B中的操作");
	}

	private void addBehavior() {
		System.out.println("具体的装饰对象B中新增的功能");
	}
}
