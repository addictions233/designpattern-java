package com.one.callback;

/**
 * @ClassName: WeChat
 * @Description: 前端WeChat页面,用户可以进行花费充值操作,但是WeChat必须在后台服务器向联通公司进行付费充值花费才算充值成功
 * @Author: one
 * @Date: 2020/12/04
 */
public class WeChat implements Callback {
    public String wechatId;//微信ID
    public String phoneNumber;  //充值手机号
    public double money; //充值金额

    //构造方法
    public WeChat(String phoneNumber,double money){
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    //调用后台充值 类Server中的recharge()方法
    public void pay(){
        Server server = new Server();  //创建类B Server的对象, 用类B的对象调用其方法bMethod() recharge(形参);
        System.out.println("你的话费充值"+money+"元,已提交成功,微信正在帮您向联通号码"+phoneNumber+"进行花费充值服务,请稍等....");
        server.recharge(WeChat.this);  //为什么??? 将对象自己作为方法的形参传递到实参
    }

    // 类A实现Callback接口必须重写里面的回调方法notifyUser()
    @Override
    public void notifyUser() {
        System.out.println("您的手机号已经充值成功,可查看您的联通号码的账号余额!");
    }
}
