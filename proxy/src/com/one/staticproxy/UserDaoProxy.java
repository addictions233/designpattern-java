package com.one.staticproxy;

/**
 * 实现静态代理: 静态代理在编译时就已经实现了, 编译完成之后的代理类就是一个实际的class文件
 * 动态代理在运行时动态生成的, 即编译完成后没有实际的class文件, 而是运行时动态生成类字节码, 并加载到JVM中
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
