package com.one.example01;

public class GreenLight implements Light{
    @Override
    public void showAndSwitch(TrafficLight trafficLight) {
        System.out.println("green light show 30s..");
        trafficLight.setLight(new YellowLight());
    }
}
