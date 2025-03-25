package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDao {

	//constructor Autowired
	private JdbcTemplate jdbcTemplate;
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int addEmployee(Employee emp) {
		String sql="insert into Employee(empName,empSalary,empAddress) values (?,?,?)";
		return jdbcTemplate.update(sql,emp.getEmpName(),emp.getEmpSalary(),emp.getEmpAddress());
	}
	
	public int  updateEmployee(Employee emp) {
		String sql="update set Employee empName=?,empSalary=?,empAddress=? where empId=?";
		
		return jdbcTemplate.update(sql,emp.getEmpId(),emp.getEmpName(),emp.getEmpSalary(),emp.getEmpAddress());
	}
	
	public Employee getEmployee(int empId) {
		String sql="select * from Employee where empId=?";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(),empId);	
	}
	
	public List<Employee> getAllEmployee(){
		String sql="select * from Employee ";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
	
	public int deleteEmployee (int empId) {
		String sql="delete  from Employee  where empId=?";
		return jdbcTemplate.update(sql, empId);
	}
	
	
	
	private static class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("empName"));
			emp.setEmpSalary(rs.getInt("empSalary"));
			emp.setEmpAddress(rs.getString("empAddress"));
			return emp;
		}
		
	}
}
