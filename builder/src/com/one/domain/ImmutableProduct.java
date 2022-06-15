package com.one.domain;

/**
 * @ClassName: ImmutableProduct
 * @Description: 不可变对象
 * @Author: one
 * @Date: 2022/03/17
 */
public class ImmutableProduct {
    private final String productName;
    private final String companyName;
    private final String part1;
    private final String part2;
    private final String part3;
    private final String part4;

    /**
     * 私有构造器,防止直接new对象,必须通过建造工厂创建
     * @param productName productName
     * @param companyName companyName
     * @param part1 part1
     * @param part2 part2
     * @param part3 part3
     * @param part4 part4
     */
    private ImmutableProduct(String productName, String companyName, String part1, String part2, String part3, String part4) {
        this.productName = productName;
        this.companyName = companyName;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
    }

    /**
     * ImmutableProduct类的建造工厂,用来建造immutableProduct对象
     * 静态内部类, 静态内部类不依赖外部类对象的存在而存在,不能使用外部类非静态成员
     */
    public static class Builder {
        private String productName;
        private String companyName;
        private String part1;
        private String part2;
        private String part3;
        private String part4;

        public Builder buildProductName(String productName) {
            this.productName = productName;
            return this; // 为了实现链式编程
        }

        public Builder buildCompanyName(String companyName) {
            this.companyName = companyName;
            return this; // 为了实现链式编程
        }

        public Builder buildPart1(String part1) {
            this.part1 = part1;
            return this; // 为了实现链式编程
        }

        public Builder buildPart2(String part2) {
            this.part2 = part2;
            return this; // 为了实现链式编程
        }

        public Builder buildPart3(String part3) {
            this.part3 = part3;
            return this; // 为了实现链式编程
        }

        public Builder buildPart4(String part4) {
            this.part4 = part4;
            return this; // 为了实现链式编程
        }

        public ImmutableProduct build() {
            return new ImmutableProduct(productName, companyName, part1, part2, part3, part4);
        }
    }

    /**
     * 只有get方法,没有set方法,属性值是不可变的,在建造工厂中就指定死了
     * @return String 属性值
     */
    public String getProductName() {
        return productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPart1() {
        return part1;
    }

    public String getPart2() {
        return part2;
    }

    public String getPart3() {
        return part3;
    }

    public String getPart4() {
        return part4;
    }

    @Override
    public String toString() {
        return "ImmutableProduct{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                '}';
    }
}
