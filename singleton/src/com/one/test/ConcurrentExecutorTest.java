package com.one.test;

import com.one.register.ContainerSingleton;
import com.one.util.ConcurrentExecutor;

/**
 * @ClassName: ConcurrentExecutorTest
 * @Description: TODO
 * @Author: one
 * @Date: 2022/06/01
 */
public class ConcurrentExecutorTest {
    public static void main(String[] args) throws Exception {
        ConcurrentExecutor.execute(() -> {
            Object bean = ContainerSingleton.getBean("com.one.pojo.Student");
            System.out.println(bean);
        }, 30, 10);

    }
}
