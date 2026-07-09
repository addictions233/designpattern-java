package com.one.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * 回执处理策略构造工厂: 用来生成所有的策略对象
 */
public class ReceiptHandleStrategyFactory {

    /**
     * 在策略工厂中使用map保存所有的策略对象
     */
    private static Map<String, ReceiptStrategy> receiptStrategyMap;

    /**
     * 初始化所有的策略对象到map集合中
     */
    public static void init() {
        receiptStrategyMap = new HashMap<>();
        receiptStrategyMap.put("MT1101", new M1101ReceiptStrategy());
        receiptStrategyMap.put("MT2101", new M2101ReceiptStrategy());
        receiptStrategyMap.put("MT4101", new M4101ReceiptStrategy());
        receiptStrategyMap.put("MT8101", new M8101ReceiptStrategy());
    }

    /**
     * 获取策略对象
     * @param receiptType 回执类型
     * @return 回执策略对象
     */
    public static ReceiptStrategy getReceiptStrategy(String receiptType) {
        return receiptStrategyMap.get(receiptType);
    }
}
