/*
 * package com.tech.preparedstatements;
 * 
 * import java.sql.SQLException;
 * 
 * import org.springframework.dao.DataAccessException; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.PreparedStatementCallback;
 * 
 * import com.mysql.jdbc.PreparedStatement;
 * 
 * public class CompanyDao { private JdbcTemplate jdbcTemplate;
 * 
 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
 * jdbcTemplate; }
 * 
 * public int saveEmployeeByPreparedStatement(final Company company) { String
 * query="insert into company values(?,?,?)"; return jdbcTemplate.execute(query,
 * PreparedStatementCallback<Boolean>(){ public Boolean
 * doInPreparedStatement(PreparedStatement ps) throws
 * SQLException,DataAccessException{ ps.setInt(1, company.getId());
 * ps.setString(2, company.getName()); ps.setString(3, company.getRole());
 * 
 * return ps.execute(); } }); } }
 */