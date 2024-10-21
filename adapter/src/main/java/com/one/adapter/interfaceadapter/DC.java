package com.one.adapter.interfaceadapter;

/**
 * 目标角色(Target): 有多个功能接口, 将多个功能集合在一起, 减少类的个数
 */
public interface DC {
    int output5V();
    int output12V();
    int output24V();
    int output36V();
}
