package com.one.template.example02;

/**
 * 抽象模板类: 银行账户
 */
public abstract class Account {

    /**
     * step1: 验证用户名和密码是否正确
     * @param account 账号户
     * @param password 密码
     * @return 判断结果
     */
    public boolean validate(String account, String password) {
        if ("tom".equalsIgnoreCase(account) && "123456".equalsIgnoreCase(password)) {
            return true;
        }
        return false;
    }

    /**
     * step2: 计算利息
     * @return 利息
     */
    public abstract String calculate();

    /**
     * 钩子函数, 子类可以重写, 也可以不重写
     * step3: 显示利息
     * @param loan 利息
     */
    protected void dispaly(String loan) {
        System.out.println("利息金额为:" + loan) ;
    }

    /**
     * 在模板类中定义模板方法
     * @param account 账户
     * @param password 密码
     */
    public void handle(String account, String password) {
        // step1
        if (!validate(account, password)) {
            System.out.println("账号或者密码错误!");
            return;
        }

        // step2: 提供给子类重写的抽象方法, 子类自定义特殊逻辑
        String load = calculate();

        // step3: 钩子函数, 子类可以重写也可以不重新的函数
        dispaly(load);
    }
}
