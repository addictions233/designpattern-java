package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * 适配器的实现只用继承中间的抽象类
 */
public class LoginByQQAdapter extends AbstractLoginAdapter {

    /**
     * 每种适配器都有自己支持的策略
     * @return
     */
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginByQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if  (!support(adapter)) {
            return null;
        }
        System.out.println("使用QQ授权登录");
        return super.loginForRegist(id, null);
    }
}
