package com.one.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author one
 * @description TODO
 * @date 2022-12-12
 */
public class MemberDao extends JdbcTemplate{
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() throws Exception {
        String sql = "select * from member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet re, int rowNumb) throws Exception {
                Member member = new Member();
                member.setName("张三");
                member.setAge(12);
                return member;
            }
        }, null);
    }
}
