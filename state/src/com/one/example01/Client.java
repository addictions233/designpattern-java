package com.one.example01;

public class Client {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new GreenLight());
        // 进行状态切换
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
    }
}
