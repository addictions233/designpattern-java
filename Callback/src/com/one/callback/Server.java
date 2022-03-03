package com.one.callback;

/**
 * @ClassName: Server
 * @Description: 在后台服务器负责向联通公司进行话费充值,此操作需要花费3秒钟
 * @Author: one
 * @Date: 2020/12/04
 */
public class Server {
    public void recharge(Callback callback){
        try {
            Thread.sleep(3000); //该线程休眠3秒,进行充值
            callback.notifyUser();   //调用回调方法
        } catch (InterruptedException e) {
            System.out.println("充值失败....");
            e.printStackTrace();
        }
    }
}
