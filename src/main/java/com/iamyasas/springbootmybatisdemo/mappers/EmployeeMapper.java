package com.iamyasas.springbootmybatisdemo.mappers;

import org.apache.ibatis.annotations.Mapper;
import com.iamyasas.springbootmybatisdemo.models.Employee;

@Mapper
public interface EmployeeMapper {
	
	public Employee[] getEmployees(String name);
	

	public Employee getEmployee(int employeeID);
	
}
