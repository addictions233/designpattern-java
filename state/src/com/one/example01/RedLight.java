package com.one.example01;

public class RedLight implements Light{
    @Override
    public void showAndSwitch(TrafficLight trafficLight) {
        System.out.println("red light show 40s..");
        trafficLight.setLight(new YellowLight());
    }
}
