package com.tech.service;

import java.util.List;

import com.tech.model.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee emp);

	public List<Employee> getEmployee(String user, String password);
	
	public List<Employee> getAllEmployee();
	
	public void deleteEmployee(int eid);
	
	public Employee editEmployee(int eid);
	
	public void updateEmployee(Employee emp);
}