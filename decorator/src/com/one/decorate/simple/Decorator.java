package com.one.decorate.simple;

/**
 * 包装类对Component接口进行扩展: 装饰者模式区别于继承的点
 * 	1, 继承涉及子类, 是在编译时静态决定的,  装饰者模式则是通过组合和委托, 可以运行时动态的为对象加上新的行为
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public abstract class Decorator implements Component {
	/**
	 * 使用组合复用原则在新对象持有原对象, 新对象通过对原对象的委派达达成复用原对象已有功能的目的
	 */
	protected Component component;


	public Decorator(Component component) {
		this.component = component;
	}


	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}
}
