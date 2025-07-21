package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.EmployeeDao;
import com.tech.model.Employee;
import com.tech.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public String saveEmployee(Employee emp) {
		String rMessage = dao.saveEmployee(emp);
		return rMessage;
	}

	@Override
	public List<Employee> getEmployee(String user, String password) {
		List<Employee> employee = dao.getEmployee(user, password);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployees = dao.getAllEmployees();
		return allEmployees;
	}

	@Override
	public void deleteEmployee(int eid) {
		dao.deleteEmployee(eid);
	}

	@Override
	public Employee editEmployee(int eid) {

		return dao.editEmployee(eid);
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}

}