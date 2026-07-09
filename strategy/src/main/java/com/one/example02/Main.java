package com.one.example02;

public class Main {

    public static void main(String[] args) {
        Receipt receipt1 = new Receipt("MT1101", "M1101回执消息");

        // 在策略工厂中生成所有的策略对象
        ReceiptHandleStrategyFactory.init();

        ReceiptStrategy receiptStrategy1 = ReceiptHandleStrategyFactory.getReceiptStrategy(receipt1.getType());

        // 在策略上下文对象中设置策略对象
        ReceiptStrategyContext strategyContext = new ReceiptStrategyContext();
        strategyContext.setReceiptStrategy(receiptStrategy1);

        // 使用策略对象处理任务
        strategyContext.handleReceipt(receipt1);

        Receipt receipt2 = new Receipt("MT8101", "M8011回执消息");
        ReceiptStrategy receiptStrategy2 = ReceiptHandleStrategyFactory.getReceiptStrategy(receipt2.getType());

        // 设置策略对象
        strategyContext.setReceiptStrategy(receiptStrategy2);

        // 执行策略
        strategyContext.handleReceipt(receipt2);
    }
}
