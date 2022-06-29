package com.one.delegate.simple;

/**
 * @ClassName: Boss
 * @Description: 老板指派任务给Leader
 * @Author: one
 * @Date: 2022/06/16
 */
public class Boss {
    public void doSomething(String command) {
        new Leader().doing(command);
    }
}
