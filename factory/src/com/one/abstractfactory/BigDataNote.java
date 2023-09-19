package com.one.abstractfactory;

/**
 * @ClassName: JavaVideo
 * @Description: 抽象工厂用来应对多功能,多维度的对象,
 * @Author: one
 * @Date: 2022/05/26
 */
public class BigDataNote implements INote {
    /**
     * 大数据具体对象
     */
    @Override
    public void takeNote() {
        System.out.println("做大数据笔记");
    }
}
