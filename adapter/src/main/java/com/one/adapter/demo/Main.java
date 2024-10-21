package com.one.adapter.demo;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 测试类
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public class Main {
	public static void main(String[] args) {
		SingleToBatchAdapter adapter = new SingleToBatchAdapterImpl(new BatchPatentImpl());
		String[] pIdArr = adapter.getPatentYears("pid_1");
		System.out.println(Arrays.toString(pIdArr));
		BigDecimal amount = adapter.getRenewalAmount("pid_1", pIdArr);
		System.out.println(amount);
		System.out.println("-----------------------------------");
		SinglePatentImpl2 singlePatentImpl2 = new SinglePatentImpl2(adapter);
		String[] pIdArr2 = singlePatentImpl2.getPatentYears("pid_1");
		System.out.println(Arrays.toString(pIdArr2));
		BigDecimal amount2 = singlePatentImpl2.getRenewalAmount("pid_1", pIdArr2);
		System.out.println(amount2);
	}
}
