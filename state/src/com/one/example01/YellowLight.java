package com.one.example01;


public class YellowLight implements Light {

    /**
     * 黄灯需要记录前一个灯,才能决定下一个灯
     */
   private Light previous;

    public YellowLight(Light previous) {
        this.previous = previous;
    }

    @Override
    public void showAndSwitch(TrafficLight trafficLight) {
        System.out.println("yellow light show 5s..");
        if (previous instanceof GreenLight) {
            trafficLight.setLight(new RedLight());
        } else {
            trafficLight.setLight(new GreenLight());
        }
    }
}
