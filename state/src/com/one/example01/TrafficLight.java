package com.one.example01;

public class TrafficLight {

    /**
     * Context持有State对象
     */
    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void startShowAndSwitch() {
        this.light.showAndSwitch(this);
    }
}
