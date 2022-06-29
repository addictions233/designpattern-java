package com.one.test;

import com.one.builder.Director;
import com.one.builder.impl.SpecialConcreteProductBuilder;
import com.one.entity.Product;

/**
 * @ClassName: BuilderTest
 * @Description: 建造者设计模式的测试类
 *          应用场景
 *              1.需要生成的对象具有复杂的内部结构
 *              2.需要生成的对象内部属性本身相互依赖
 *              3.与不可变对象配合使用
 *          优点：
 *              1、建造者独立，易扩展。
 *              2、便于控制细节风险。
 * @Author: one
 * @Date: 2022/03/17
 */
public class BuilderTest {
    public static void main(String[] args) {
        // 要构建Product对象
        Director director = new Director(new SpecialConcreteProductBuilder());
        Product product = director.makeProduct("手机", "华为", "屏幕", "摄像头", "芯片", "电池");
        System.out.println(product);
    }
}
