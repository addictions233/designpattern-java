package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * 适配器的实现只用继承中间的抽象类
 */
public class LoginByQQAdapter extends AbstractLoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginByQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if  (!support(adapter)) {
            return null;
        }
        return super.loginForRegist(id, null);
    }
}
