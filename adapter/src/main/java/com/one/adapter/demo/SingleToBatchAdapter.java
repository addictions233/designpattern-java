package com.one.adapter.demo;

/**
 *
 * 将批量专利的功能适配单个专利的接口接口: 谁要被适配, 适配器接口就继承谁, 因为适配器要替代原有对象的功能, 需要继承原被适配对象
 * 这里将单个的专利授权转为批量的专利授权, 所以被适配的单个, 实现单个接口
 *
 * @author wanjunjie
 * @date 2023/9/19
 */
public interface SingleToBatchAdapter extends SinglePatent{
}
