package com.employee.service.impl;

import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;
import com.employee.populator.EmployeePopulator;
import com.employee.repository.impl.DefaultEmployeeDaoImpl;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	DefaultEmployeeDaoImpl employeeDao;
	
	@Autowired
	EmployeePopulator employeePopulator;
	
	@Override
	public EmployeeDto getEmployee() {
		EmployeeDto employeeDto = new EmployeeDto();
		employeePopulator.populate(employeeDao.getEmployee(),employeeDto);
		return employeeDto;
	}

	@Override
	public void addEmployee(EmployeeModel employee) {
	}

}
