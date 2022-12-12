package com.one.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author one
 * @description TODO
 * @date 2022-12-12
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public <T> List<T> executeQuery(String sql, RowMapper<T> rm, Object[] values) throws Exception{
        // 1, 获取连接
        Connection conn = this.createConnection();
        // 2, 创建语句集
        PreparedStatement pstm = this.createPrepareStatement(conn, sql);
        // 3, 创建结果集
        ResultSet rs = this.createResultSet(pstm, values);
        // 4, 处理结果集
        List<T> results = this.parseResultSet(rs, rm);
        // 5, 关闭结果集
        this.closeResultSet(rs);
        // 6, 关闭语句集
        this.closePrepareStatement(pstm);
        // 7, 关闭连接
        this.closeConnection(conn);
        return results;
    }

    private void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    private void closePrepareStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private <T> List<T> parseResultSet(ResultSet rs, RowMapper<T> rm) throws Exception {
        List<T> results = new ArrayList<>();
        int rowNum = 1;
        while(rs.next()) {
            results.add(rm.mapRow(rs,rowNum++));
        }
        return results;
    }

    private ResultSet createResultSet(PreparedStatement pstm, Object[] values) throws SQLException {
        // 设置参数
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    protected Connection createConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
