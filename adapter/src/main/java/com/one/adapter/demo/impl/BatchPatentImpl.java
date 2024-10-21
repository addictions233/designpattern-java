package com.one.adapter.demo.impl;

import com.one.adapter.demo.BatchPatent;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * 批量专利授权续费接口实现
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class BatchPatentImpl implements BatchPatent {

    @Override
    public Map<String, List<String>> getYears(String[] pIds) {
        Map<String, List<String>> resultMap = new HashMap<>(4);
        resultMap.put("pid_0", Arrays.asList("2023", "2024"));
        resultMap.put("pid_1", Arrays.asList("2023", "2024", "2025"));
        resultMap.put("pid_2", Arrays.asList("2023", "2024"));
        return resultMap;
    }

    @Override
    public Map<String, BigDecimal> getRenewalAmounts(Map<String, List<String>> pIdAndYears) {
        Map<String, BigDecimal> resultMap = new HashMap<>(4);
        pIdAndYears.forEach((pId, years) -> {
            Map<String, BigDecimal> PID_MAP = PRICE_MAP.apply(pId);// 从数据中心获取数据
            BigDecimal sum = new BigDecimal(0);
            for (String year : years) {
                sum = sum.add(PID_MAP.getOrDefault(year, new BigDecimal(0)));
            }
            resultMap.put(pId, sum);
        });
        return resultMap;
    }

    // 模拟，当作数据库或数据中心，我要调用它
    private static final Function<String, Map<String, BigDecimal>> PRICE_MAP =
            (String pId) -> {
                Map<String, BigDecimal> data = new HashMap<>(); // 模拟续费年份价格，共用一份数据，避免讲述复杂
                data.put("2023", new BigDecimal("300.00"));
                data.put("2024", new BigDecimal("400.00"));
                data.put("2025", new BigDecimal("500.00"));
                return data;
            };
}