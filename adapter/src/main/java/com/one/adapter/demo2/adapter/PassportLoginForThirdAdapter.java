package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

import javax.sql.DataSource;

/**
 * @author one
 * @description 遵循最少知道原则, 统一所有的登录适配器, 统一对外提供登录功能, 但是违背了单一职责原则
 * @date 2024-10-23
 */
public class PassportLoginForThirdAdapter implements IPassportForThird{
    @Override
    public ResultMsg loginByQQ(String openId) {
        return processLogin(openId, LoginByQQAdapter.class);
    }

    @Override
    public ResultMsg loginByWechat(String openId) {
        return processLogin(openId, LoginByWechatAdapter.class);
    }

    @Override
    public ResultMsg loginByToken(String token) {
        return processLogin(token, LoginByTokenAdapter.class);
    }

    @Override
    public ResultMsg loginByPhone(String phoneNumber, String code) {
        return processLogin(phoneNumber, LoginByPhoneAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            // 使用工厂模式创建具体的职责对象
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {

        }
        return null;
    }
}
