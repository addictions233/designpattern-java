package com.one.jdkproxy.demo;

import com.one.jdkproxy.demo.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void sayHelloWorld(String name) {
		System.out.println("Hello World,"+name);

	}

}
