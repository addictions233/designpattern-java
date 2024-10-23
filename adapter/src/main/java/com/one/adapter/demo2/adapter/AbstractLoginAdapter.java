package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.PassportService;
import com.one.adapter.demo2.ResultMsg;

/**
 * @author one
 * @description 适配器接口和适配器实现类之间的抽象实现类, 提取公共方法
 * @date 2024-10-23
 */
public abstract class AbstractLoginAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegist(String username,String password) {
        if (password == null) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
