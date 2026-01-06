package com.one.example01;

import java.util.Random;

public class YellowLight implements Light {
    @Override
    public void showAndSwitch(TrafficLight trafficLight) {
        System.out.println("yellow light show 5s..");
        trafficLight.setLight(new GreenLight());
    }
}
