package com.one.builder.v2;

/**
 * @ClassName: ImmutableBuilderTest
 * @Description: 建造者模式与不可变对象结合使用
 * @Author: one
 * @Date: 2022/03/17
 */
public class ImmutableBuilderTest {
    public static void main(String[] args) {
        ImmutableProduct product = new ImmutableProduct.Builder()
                .buildProductName("手机")
                .buildCompanyName("华为")
                .buildPart1("屏幕")
                .buildPart2("摄像头")
                .buildPart3("芯片")
                .buildPart4("电池").build();
        System.out.println(product);
    }
}
