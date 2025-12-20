package com.one.singleresponsibility;

/**
 * 单一职责原则: 一个类尽量只完成一个功能, 而不是让其实现尽可能多的功能,如果一个类具有多个功能时,
 *      那么它在实现A功能和B功可能时会出现问题, 这样情况下应该根据实现功能的不同将类进行拆分
 * 接口, 类, 方法都可以按照单一职责进行拆分
 * @author one
 */
public class Main {
    public static void main(String[] args) {
        // 不遵循单一职责的写法
        method1();

        System.out.println("------------------------------------");

        // v1: 第一种解决方法: 将 run()方法按照单一职责进行拆分, 如下定义了 Vehicle2中定义的run()方法
        Vehicle2 car = new Vehicle2("汽车");
        car.roadRun();

        Vehicle2 ship = new Vehicle2("轮船");
        ship.waterRun();

        Vehicle2 plane = new Vehicle2("飞机");
        plane.ariRun();

        System.out.println("------------------------------------");

        // v2:第二种解决方法: 按照交通工具的方式不同对Vehicle类按照单一职责进行拆分
        RoadVehicle car2 = new RoadVehicle("汽车");
        car2.run();

        WaterVehicle ship2 = new WaterVehicle("轮船");
        ship2.run();

        AirVehicle plane2 = new AirVehicle("飞机");
        plane2.run();

    }


    private static void method1() {
        Vehicle car = new Vehicle("汽车");
        car.run();

        Vehicle plane = new Vehicle("飞机");
        plane.run();

        Vehicle ship = new Vehicle("轮船");
        ship.run();

        Vehicle 摩托车 = new Vehicle("摩托车");
        摩托车.run();
    }


    /**
     * 定义一个交通工具类,里面有一个#run()方法, 表示交通工具的功能
     */
    static class Vehicle {
        String vehicleName;

        public Vehicle(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        /**
         * 不遵循单一职责, 需要添加新的功能就添加if else
         */
        public void run(){
            if (vehicleName.equals("汽车")) {
                System.out.println(vehicleName+"在公路上跑!");
            } else if (vehicleName.equals("飞机")) {
                System.out.println(vehicleName + "在天上飞!");
            } else if (vehicleName.equals("轮船")) {
                System.out.println(vehicleName + "在水上跑!");
            }
        }
    }

    /**
     *  按照单一职责原则,对于较简单的类, 可以直接对方法进行拆分
     */
    static class Vehicle2{
        String  vehicleName;
        public Vehicle2(String vehicleName){
            this.vehicleName = vehicleName;
        }

        /**
         * 对于方法, 按照单一职责进行拆分
         */
        public void waterRun(){
            System.out.println(vehicleName+"在水上跑!");
        }

        /**
         * 对于方法, 按照单一职责进行拆分
         */
        public void roadRun(){
            System.out.println(vehicleName+"在公路上跑!");
        }

        /**
         * 对于方法, 按照单一职责进行拆分
         */
        public void ariRun(){
            System.out.println(vehicleName+"在天上飞!");
        }
    }

}




