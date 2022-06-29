package com.one.builder.impl;

import com.one.builder.ProductBuilder;
import com.one.entity.Product;

/**
 * @ClassName: DefaultConcreteProductBuilder
 * @Description: 建造者设计模式适用于创建属性比较多的对象
 * @Author: one
 * @Date: 2022/03/17
 */
public class DefaultConcreteProductBuilder implements ProductBuilder {
    private String productName;
    private String companyName;
    private String part1;
    private String part2;
    private String part3;
    private String part4;

    @Override
    public void builderProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void builderCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void builderPart1(String part1) {
        this.part1 = part1;
    }

    @Override
    public void builderPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public void builderPart3(String part3) {
        this.part3 = part3;
    }

    @Override
    public void builderPart4(String part4) {
        this.part4 = part4;
    }

    @Override
    public Product build() {
        return new Product(productName, companyName, part1, part2, part3, part4);
    }
}
