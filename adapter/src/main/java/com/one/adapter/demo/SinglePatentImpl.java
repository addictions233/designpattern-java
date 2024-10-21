package com.one.adapter.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * 单个专利授权续费实现类
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class SinglePatentImpl implements SinglePatent{
	/**
	 * 通过专利id获取专利对应的授权年限
	 *
	 * @param pId 专利id
	 * @return 续费年限
	 */
	@Override
	public String[] getPatentYears(String pId) {
		return new String[]{"2023","2024","2025"};
	}

	/**
	 * 通过专利id, 续费年限计算专利续费总金额
	 *
	 * @param pId   专利id
	 * @param years 续费年限
	 * @return 续费金额
	 */
	@Override
	public BigDecimal getRenewalAmount(String pId, String[] years) {
		Map<String, BigDecimal> priceMap = patentPrice.apply(pId);
		BigDecimal sum = new BigDecimal(0);
		for (String year : years) {
			BigDecimal price = priceMap.getOrDefault(year, new BigDecimal(0));
			sum = sum.add(price);
		}
		return sum;
	}

	private Function<String, Map<String, BigDecimal>> patentPrice =  pId -> new HashMap<String, BigDecimal>() {{
		put("2023", new BigDecimal("500.00"));
		put("2024", new BigDecimal("600.00"));
		put("2025", new BigDecimal("700.00"));
	}};
}
