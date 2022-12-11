package com.one.template.course;

/**
 * @author one
 * @description 使用抽象类实现模板模式:
 *                  1, 一次性实现一个算法的不变的部分, 并将可变的行为留给子类来实现
 *                  2, 各子类中公共的行为被抽取出来并集中到一个公共的父类中, 从而避免代码重复
 * @date 2022-12-11
 */
public abstract class NetCourse {

    protected final void createCourse() {
        // 1, 备课
        this.prepareCourse();

        // 2, 进行授课
        this.courseVideo();

        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    /**
     * 定义为抽象方法, 希望子类进行重写, 每个子类需要读这个方法实现定制化
     */
    protected abstract void checkHomeWork();

    /**
     * 虽然父类返回了false, 但是可以让子类进行重写, 进行调整
     * @return boolean
     */
    protected boolean needHomeWork() {
        return false;
    }

    /**
     * 定义为final防止子类重写
     */
    final void courseVideo() {
        System.out.println("进行授课");
    }

    /**
     * 定义为final是为了使抽象类中不希望被子类重写的方法
     */
    final void prepareCourse() {
        System.out.println("进行备课");
    }
}
