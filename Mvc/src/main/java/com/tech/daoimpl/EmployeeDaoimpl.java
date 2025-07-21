package com.tech.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dao.EmployeeDao;
import com.tech.model.Employee;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {
	@Autowired
	SessionFactory sf;

	@Override
	public String saveEmployee(Employee emp) {

		Session session = sf.openSession();

		session.save(emp);
		session.beginTransaction().commit();
		
		
		return "Employee registration is Successful";
	}

	@Override
	public List<Employee> getEmployee(String user, String password) {
		Session session = sf.openSession();

		Query query = session.createQuery("from Employee where user=:user and password=:password");
		query.setParameter("user", user);
		query.setParameter("password", password);
		List employee = query.getResultList();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Session session = sf.openSession();

		Query q = session.createQuery("from Employee");
		List<Employee> employees = q.getResultList();
		return employees;
	}

	@Override
	public void deleteEmployee(int eid) {
		Session session = sf.openSession();
		Employee emp = session.get(Employee.class, eid);
		session.delete(emp);
		session.beginTransaction().commit();
		session.close();

	}

	@Override
	public Employee editEmployee(int eid) {
		Session session = sf.openSession();
		Employee emp = session.get(Employee.class, eid);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		Session session = sf.openSession();
		session.update(emp);
		session.beginTransaction().commit();
		session.close();

	}

}