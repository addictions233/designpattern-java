package com.one.openclose;

/**
 * @author one
 * @description 当我们有个节假日课程价格打8折的场景, 又不想对原有的课程做修改, 遵循开闭原则, 使用继承进行扩展
 * @date 2024-9-15
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取打折后的价格
     */
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }


}
