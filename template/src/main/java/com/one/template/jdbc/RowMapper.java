package com.one.template.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {
    /**
     * 对查询结果每一行进行映射
     * @param re 查询结果
     * @param rowNumb 行号
     * @return 映射结果
     * @throws Exception 异常
     */
    T mapRow(ResultSet re, int rowNumb) throws Exception;
}
