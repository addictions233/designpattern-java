package com.one.example02;

/**
 * M2101类型的回执处理策略实现
 */
public class M2101ReceiptStrategy implements ReceiptStrategy{
    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("收取回执类型:" + receipt.getType());
        System.out.println("处理回执消息:" + receipt.getMessage());
    }
}
