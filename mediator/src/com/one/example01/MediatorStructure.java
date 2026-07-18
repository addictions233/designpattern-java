package com.one.example01;

/**
 * 中介机构: 具体的中介实现类
 */
public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;

    private Tenant tenant;

    @Override
    public void register(Person person) {
        if (person instanceof HouseOwner) {
            this.houseOwner = (HouseOwner) person;
        } else {
            this.tenant = (Tenant) person;
        }
    }

    @Override
    public void contact(String message, Person person) {
        if (person instanceof HouseOwner) {
            // 房主发布的消息, 通知到租户
            this.tenant.getMessage(message);
        } else {
            // 租户发布的消息, 通知到房主
            this.houseOwner.getMessage(message);
        }

    }
}
