package com.employee.repository;

import com.employee.model.EmployeeModel;

public interface EmployeeDao {

	public void addEmployee(EmployeeModel employee);
	
	public EmployeeModel getEmployee();
}
