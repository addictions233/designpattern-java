package com.one.builder;

import com.one.entity.Product;

/**
 * @InterfaceName: ProductBuilder
 * @Description: 用来构建Product对象的建造类
 * @Author: one
 * @Date: 2022/03/17
 */
public interface ProductBuilder {
    /**
     * 设置Product对象的 productName属性值
     * @param productName productName
     */
    void builderProductName(String productName);

    /**
     * 设置Product对象的 companyName属性值
     * @param companyName companyName
     */
    void builderCompanyName(String companyName);

    /**
     * 设置Product对象的 part1属性值
     * @param part1 part1
     */
    void builderPart1(String part1);

    /**
     * 设置Product对象的 part2属性值
     * @param part2 part2
     */
    void builderPart2(String part2);

    /**
     * 设置Product对象的 part3属性值
     * @param part3 part3
     */
    void builderPart3(String part3);

    /**
     * 设置Product对象的 part4属性值
     * @param part4 part4
     */
    void builderPart4(String part4);

    /**
     * 构建Product对象
     * @return Product
     */
    Product build();
}
