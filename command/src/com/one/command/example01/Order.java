package com.one.command.example01;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户下的订单
 */
public class Order {


    /**
     * 几号桌
     */
    private Integer diningTable;

    /**
     * 订的菜品和份数
     */
    private Map<String, Integer> foodMenu;

    public Order() {
        this.foodMenu = new HashMap<>();
    }

    public Integer getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(Map<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }

}
