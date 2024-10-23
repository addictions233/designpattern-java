package com.one.adapter.demo2.adapter;

import com.one.adapter.demo2.ResultMsg;

/**
 * @author one
 * @description 单个适配器实现的通用接口
 * @date 2024-10-23
 */
public interface ILoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
