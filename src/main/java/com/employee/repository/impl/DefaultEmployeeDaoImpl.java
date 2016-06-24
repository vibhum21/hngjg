package com.employee.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.employee.model.EmployeeModel;
import com.employee.repository.EmployeeDao;

@Repository
public class DefaultEmployeeDaoImpl implements EmployeeDao {
	
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void addEmployee(EmployeeModel employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeModel getEmployee() {
		TypedQuery<EmployeeModel> qt = entityManager.createQuery("SELECT e FROM EmployeeModel e", EmployeeModel.class);
		List<EmployeeModel> employeeList = (List<EmployeeModel>)qt.getResultList();
		System.out.println("employeeList"+employeeList);
		return employeeList.get(0);
	}

}
