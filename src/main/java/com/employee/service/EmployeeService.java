package com.employee.service;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;

public interface EmployeeService {

	public void addEmployee(EmployeeModel employee);
	
	public EmployeeDto getEmployee();
}
