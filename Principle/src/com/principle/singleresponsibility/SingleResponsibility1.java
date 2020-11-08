package com.principle.singleresponsibility;

/**
 * 单一职责原则: 一个类尽量只完成一个功能, 而不是让其实现尽可能多的功能,如果一个类具有多个功能时,
 *      那么它在实现A功能和B功可能时会出现问题, 这样情况下应该根据实现功能的不同将类进行拆分
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
//        method1();
        /*
            第一种解决方法: 将 run()方法进行拆分, 如下定义了 Vehicle2中定义的run()方法
         */
        Vehicle2 汽车 = new Vehicle2("汽车");
        汽车.roadRun();

        Vehicle2 轮船 = new Vehicle2("轮船");
        轮船.waterRun();

        Vehicle2 飞机 = new Vehicle2("飞机");
        飞机.ariRun();

//        method2();

    }

    private static void method2() {
    /*
        第二种解决方法: 按照交通工具的方式不同对Vehicle进行拆分
     */
        RoadVehicle 汽车 = new RoadVehicle("汽车");
        汽车.run();

        WaterVehicle 轮船 = new WaterVehicle("轮船");
        轮船.run();

        AirVehicle 飞机 = new AirVehicle("飞机");
        飞机.run();
    }

    private static void method1() {
        Vehicle 汽车 = new Vehicle("汽车");
        汽车.run();

        Vehicle 摩托车 = new Vehicle("摩托车");
        摩托车.run();
        /*
            由于类Vehicle具备了各种交通工具的功能,这样调用run()方法就会出现下述问题
         */
        Vehicle 飞机 = new Vehicle("飞机");
        飞机.run(); // 飞机在公路上跑!

        Vehicle 轮船 = new Vehicle("轮船");
        轮船.run();  //轮船在公路上跑!
    }
}


/*
    定义一个交通工具类,里面有一个run()方法
 */

class Vehicle {
    String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void run(){
        System.out.println(vehicleName+"在公路上跑!");
    }
}

/**
 *  按照单一职责原则,对于较简单的类, 可以直接对方法进行拆分
 */
class Vehicle2{
    String  vehicleName;
    public Vehicle2(String vehicleName){
        this.vehicleName = vehicleName;
    }

    public void waterRun(){
        System.out.println(vehicleName+"在水上跑!");
    }

    public void roadRun(){
        System.out.println(vehicleName+"在公路上跑!");
    }

    public void ariRun(){
        System.out.println(vehicleName+"在天上飞!");
    }
}
