package com.one.adapter.demo;

import com.one.adapter.demo.impl.BatchPatentImpl;

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
	}
}
