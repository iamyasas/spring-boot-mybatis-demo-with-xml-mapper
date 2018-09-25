package com.iamyasas.springbootmybatisdemo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iamyasas.springbootmybatisdemo.models.Employee;

@Mapper
public interface EmployeeMapper {
	
	public Employee[] getEmployees(@Param("name") String name);
	
	public Employee getEmployee(@Param("employeeID") int employeeID);
	
}
