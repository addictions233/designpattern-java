package com.one.decorate;

/**
 * 具体的装饰实现类
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class ConcreteDecoratorA extends Decorator{
	@Override
	public void operation() {
		super.operation();
		addBehaviour();
		System.out.println("具体装饰对象A中的操作");
	}

	public ConcreteDecoratorA(Component component) {
		super(component);

	}

	private void addBehaviour() {
		System.out.println("装饰者A中新添加的功能");
	}
}
