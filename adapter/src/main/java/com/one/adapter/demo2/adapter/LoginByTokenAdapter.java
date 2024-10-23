package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * @author one
 * @description TODO
 * @date 2024-10-23
 */
public class LoginByTokenAdapter extends AbstractLoginAdapter{

    /**
     * 每种适配器都有自己支持的策略
     * @return
     */
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginByTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        System.out.println("使用Token验证登录");
        return super.login(id, null);
    }
}
