package com.one.observer.demo2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: one
 * @Date: 2022/05/08
 */
public class Main {
    public static void main(String[] args) {
        // 创建被观察者对象
        PropertyChangeName propertyChangeName = new PropertyChangeName();

        // 向被观察者中添加观察者对象
        propertyChangeName.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                System.out.println("OldValue:" + event.getOldValue());
                System.out.println("NewValue:" + event.getNewValue());
                System.out.println("propertyName:" + event.getPropertyName());
            }
        });

        // 被观察者事件发生变化, 通知观察者
        propertyChangeName.setName("new Name");
    }
}
