package com.one.example01;

import javax.net.ssl.HostnameVerifier;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new MediatorStructure();

        Tenant tenant = new Tenant("张三", mediator);

        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        mediator.register(tenant);
        mediator.register(houseOwner);

        tenant.contact("我是" + tenant.name + ",我想租一套三室一厅, 期望价格是3000~4000");
        houseOwner.contact("我是" + houseOwner.name + ",我出租一套三室一厅, 租期一年, 价格面谈");
    }
}
