package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;


/**
 * @author one
 * @description 第三方登录的接口
 * @date 2024-10-23
 */
public interface IPassportForThird {

    ResultMsg loginByQQ(String openId);

    ResultMsg loginByWechat(String openId);

    ResultMsg loginByToken(String token);

    ResultMsg loginByPhone(String phoneNumber, String code);
}
