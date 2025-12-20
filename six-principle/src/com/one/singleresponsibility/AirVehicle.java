package com.one.singleresponsibility;

/**
 * 定义一个空中交通工具类 AirVehicle
 * @author one
 */
public class AirVehicle {
    String name;
    public AirVehicle(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name+"在天上飞!");
    }
}
