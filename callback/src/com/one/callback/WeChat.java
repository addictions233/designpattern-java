package com.one.callback;

/**
 * @ClassName: WeChat
 * @Description: 前端WeChat页面,用户可以进行花费充值操作,但是WeChat必须在后台服务器向联通公司进行付费充值花费才算充值成功
 *
 * @Author: one
 * @Date: 2020/12/04
 */
public class WeChat  {

    /**
     * 充值手机号
     */
    public String phoneNumber;

    /**
     * 充值金额
     */
    public double money;

    /**
     * 充值完成之后的回调函数
     */
    public Callback callback;

    //构造方法
    public WeChat(String phoneNumber,double money, Callback callback){
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.callback = callback;
    }

    //调用后台充值 类Server中的recharge()方法
    public void pay() {
        System.out.println("你的话费充值" + money + "元,已提交成功,微信正在帮您向联通号码" + phoneNumber + "进行花费充值服务,请稍等....");
        new Thread(() ->  {
            //创建Server对象, 调用其方法#recharge()
            Server server = new Server();
            server.recharge(this.callback);
        }).start();
    }
}
