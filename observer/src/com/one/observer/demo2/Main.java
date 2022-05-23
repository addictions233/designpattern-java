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
        ChangeName changeName = new ChangeName();
        changeName.addPropertyChangeListener(new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                System.out.println("OldValue:"+event.getOldValue());
                System.out.println("NewValue:"+event.getNewValue());
                System.out.println("tPropertyName:"+event.getPropertyName());
            }});
        changeName.setName("new Name");
    }
}
