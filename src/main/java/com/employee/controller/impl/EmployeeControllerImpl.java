package com.employee.controller.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.controller.EmployeeController;
import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;
import com.employee.populator.EmployeePopulator;
import com.employee.repository.impl.DefaultEmployeeDaoImpl;
import com.employee.service.EmployeeService;

@Path("/employeeServ")
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired 
	EmployeeService employeeService;
	
	@Autowired
	DefaultEmployeeDaoImpl employeeDao;
	
	@Autowired
	EmployeePopulator employeePopulator;
	
	@Override
	public void addEmployee(EmployeeDto employee) {

		
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Override
	public EmployeeDto getEmployee() {
		System.out.println("Inside Controller");
		EmployeeDto employeeDto = employeeService.getEmployee();
		return employeeDto;
	}

}
