package com.one.adapter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 批量专利续费接口: 先定义两个已存在且需要被兼容的接口和实现
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public interface BatchPatent {

    /**
     * 专利的续费年限获取
     *
     * @param pIds 专利号
     * @return 专利号和年份
     */
    Map<String, List<String>> getYears(String[] pIds);

    /**
     * 专利的续费金额计算
     *
     * @param pIdAndYears 专利号和年份
     * @return 专利号和金额
     */
    Map<String, BigDecimal> getRenewalAmounts(Map<String, List<String>> pIdAndYears);
}


