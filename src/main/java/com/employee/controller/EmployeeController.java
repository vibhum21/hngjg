package com.employee.controller;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;

public interface EmployeeController {

	public void addEmployee(EmployeeDto employee);
	
	public EmployeeDto getEmployee();
}
