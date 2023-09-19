package com.one.adapter;

import java.math.BigDecimal;

/**
 * 持有适配器对象来改造被适配对象
 *
 * 另一种是你原来的被适配类里面还有一些前置逻辑需要被处理，适配的是部分逻辑，则需要将适配器也注入到原来的被适配器类；
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class SinglePatentImpl2 implements SinglePatent{

	private final SingleToBatchAdapter adapter;

	public SinglePatentImpl2(SingleToBatchAdapter singleToBatchAdapter) {
		this.adapter = singleToBatchAdapter;
	}

	/**
	 * 通过专利id获取专利对应的授权年限
	 *
	 * @param pId 专利id
	 * @return 续费年限
	 */
	@Override
	public String[] getPatentYears(String pId) {
		// todo 这里可以做一些校验逻辑,区别于原本的被适配对象
		return adapter.getPatentYears(pId);
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
		return adapter.getRenewalAmount(pId, years);
	}
}
