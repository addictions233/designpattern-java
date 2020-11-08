package com.principle.singleresponsibility;

/**
 *  定义一个水上交通工具类 WaterVehicle
 */
public class WaterVehicle {
    String name;
    public WaterVehicle(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name+"在水上跑!");
    }
}
