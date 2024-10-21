package com.one.adapter.demo;

import java.math.BigDecimal;

/**
 * 单个专利授权续费接口: 先定义两个已存在且需要被兼容的接口和实现
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public interface SinglePatent {
	/**
	 * 通过专利id获取专利对应的授权年限
	 * @param pId 专利id
	 * @return 续费年限
	 */
	String[] getPatentYears(String pId);

	/**
	 * 通过专利id, 续费年限计算专利续费总金额
	 *
	 * @param pId 专利id
	 * @param years 续费年限
	 * @return 续费金额
	 */
	BigDecimal getRenewalAmount(String pId, String[] years);


}
