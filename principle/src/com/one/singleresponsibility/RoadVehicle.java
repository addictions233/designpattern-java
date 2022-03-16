package com.one.singleresponsibility;

/**
 *  定义一个陆地交通工具类 RoadVehicle
 */
public class RoadVehicle {
    String name;

    public RoadVehicle(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name+"在公路上跑!");
    }
}
