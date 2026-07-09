package com.one.example02;

/**
 * 策略上下文对象
 */
public class ReceiptStrategyContext {

    /**
     * 策略上下文对象持有策略对象
     */
    private ReceiptStrategy receiptStrategy;

    public void setReceiptStrategy(ReceiptStrategy receiptStrategy) {
        this.receiptStrategy = receiptStrategy;
    }

    /**
     * 使用策略对象真正处理回执
     * @param receipt 回执对象
     */
    public void handleReceipt(Receipt receipt) {
        this.receiptStrategy.handleReceipt(receipt);
    }
}
