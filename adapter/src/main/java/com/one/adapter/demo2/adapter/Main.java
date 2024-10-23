package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * @author one
 * @description 测试类
 * @date 2024-10-23
 */
public class Main {

    public static void main(String[] args) {
        PassportLoginForThirdAdapter thirdAdapter = new PassportLoginForThirdAdapter();
        ResultMsg resultMsg = thirdAdapter.loginByQQ("123");
        System.out.println(resultMsg);
        ResultMsg resultMsg1 = thirdAdapter.loginByToken("token");
        System.out.println(resultMsg1);

    }
}
