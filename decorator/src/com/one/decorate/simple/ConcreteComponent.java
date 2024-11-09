package com.one.decorate.simple;

/**
 * 具体的Component实现
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class ConcreteComponent implements Component{
	@Override
	public void operation() {
		System.out.println("原始对象具体的功能");
	}
}
