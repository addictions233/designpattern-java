package com.one.example02;

/**
 * 回执信息处理策略接口
 */
public interface ReceiptStrategy {

    /**
     * 处理回执方法
     * @param receipt 回执对象
     */
    void handleReceipt(Receipt receipt);
}
