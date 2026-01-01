package com.one.staticproxy;

/**
 * 实现静态代理
 */
public class UserDaoProxy implements IUserDao {

    /**
     * 持有目标对象
     */
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开启事务"); // 对目标对象进行增强
        target.save();
        System.out.println("提交事务");
    }
}
