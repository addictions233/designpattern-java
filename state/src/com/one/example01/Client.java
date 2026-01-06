package com.one.example01;

public class Client {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new YellowLight());
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
        trafficLight.startShowAndSwitch();
    }
}
