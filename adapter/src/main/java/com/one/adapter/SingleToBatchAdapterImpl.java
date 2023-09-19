package com.one.adapter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 适配器接口的实现类
 * 适配器的作用: 将一个类的接口转换成你希望的另外一个接口, 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 *
 * 一种是适配器适配了所有的逻辑，那就直接将适配器当作新逻辑，直接将上层代码指向适配器（或直接继承父类），但是我个人不推荐
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class SingleToBatchAdapterImpl implements SingleToBatchAdapter{

	/**
	 * 适配器需要持有适配后的对象,将被适配对象的功能转换为适配对象的功能
	 * 通过对批量专利授权对象的持有和委派, 将单个专利授权的功能适配为批量授权的功能
	 * 表面还是调用单个专利的功能, 通过适配器实际走的是批量专利续费的功能
	 */
	private final BatchPatent batchPatent;

	public SingleToBatchAdapterImpl(BatchPatent batchPatent) {
		this.batchPatent = batchPatent;
	}


	/**
	 * 通过专利id获取专利对应的授权年限
	 *
	 * @param pId 专利id
	 * @return 续费年限
	 */
	@Override
	public String[] getPatentYears(String pId) {
		Map<String, List<String>> pIdMap = batchPatent.getYears(new String[]{pId});
		List<String> yearList = pIdMap.get(pId);
		return yearList.toArray(new String[0]);
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
		Map<String, List<String>> pIdAndYears = new HashMap<>(1);
		pIdAndYears.put(pId, Arrays.asList(years));
		return batchPatent.getRenewalAmounts(pIdAndYears).get(pId);
	}
}
