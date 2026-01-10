package com.one.observer.demo2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author one
 * 可以使用java.beans包里的PropertyChangeEvent 和 PropertyChangeListener 来代替目前Observer和Observable的功能。
 */
public class PropertyChangeName {

    private String name;

    /**
     * 以this对象作为事件源,创建监听器
     */
    private PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public PropertyChangeName() {
        this.name = "my name";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        String oldValue = this.name;
        this.name = name;
        //发布监听事件
        firePropertyChange("name attribute", oldValue, name);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.removePropertyChangeListener(listener);
    }

    protected void firePropertyChange(String prop, Object oldValue, Object newValue) {
        listeners.firePropertyChange(prop, oldValue, newValue);
    }
}
