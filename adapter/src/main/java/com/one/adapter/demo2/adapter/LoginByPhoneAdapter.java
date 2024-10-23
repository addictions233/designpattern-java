package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * @author one
 * @description TODO
 * @date 2024-10-23
 */
public class LoginByPhoneAdapter extends AbstractLoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginByPhoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegist(id, null);
    }
}
