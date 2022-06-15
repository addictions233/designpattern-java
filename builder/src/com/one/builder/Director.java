package com.one.builder;


import com.one.domain.Product;

/**
 * @ClassName: Director 引导器
 * @Description: 建造者设计模式也是属于创建者设计模式
 * @Author: one
 * @Date: 2022/03/17
 */
public class Director {
    private ProductBuilder productBuilder;

    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product makeProduct(String productName, String companyName, String part1, String part2, String part3, String part4) {
        productBuilder.builderProductName(productName);
        productBuilder.builderCompanyName(companyName);
        productBuilder.builderPart1(part1);
        productBuilder.builderPart2(part2);
        productBuilder.builderPart3(part3);
        productBuilder.builderPart4(part4);

        return productBuilder.build();
    }
}
