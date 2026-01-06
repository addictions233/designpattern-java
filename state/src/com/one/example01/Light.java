package com.one.example01;

public interface Light {

    /**
     * 定义状态对象, 依赖Context
     * @param trafficLight 作为Context对象
     */
    void showAndSwitch(TrafficLight trafficLight);
}
