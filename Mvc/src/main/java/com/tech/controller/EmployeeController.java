package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tech.model.Employee;
import com.tech.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@RequestMapping("/reg")
	public String registerEmployee(@ModelAttribute Employee emp) {
//		System.out.println(emp.getEid());
//		System.out.println(emp.getEname());
		String rMessage = service.saveEmployee(emp);
		System.out.println(rMessage);
		return "index";
	}

	@RequestMapping("/log")
	public String getEmployee(@RequestParam("user") String user, @RequestParam("password") String password, Model m) {

		if (user.equals("admin") && password.equals("bn13")) {
			List<Employee> allEmployees = service.getAllEmployee();
			m.addAttribute("records", allEmployees);
			for (Employee emp : allEmployees) {
				System.out.println("\nEmployee Id:      " + emp.getEid());
				System.out.println("Employee Name:      " + emp.getEname());
				System.out.println("Employee Address:   " + emp.getAddrs());
				System.out.println("Employee Salary:    " + emp.getSalary());
				System.out.println("Employee UserName:  " + emp.getUser());
				System.out.println("Employee Password:  " + emp.getPassword());
				System.out.println("----------------");
			}
			return "successpage";
		}

		List<Employee> employee = service.getEmployee(user, password);
		if (!employee.isEmpty() && user.equals(user) && password.equals(password)) {
			m.addAttribute("records", employee);
			for (Employee emp : employee) {
				System.out.println("\nEmployee Id:        " + emp.getEid());
				System.out.println("Employee Name:      " + emp.getEname());
				System.out.println("Employee Address:   " + emp.getAddrs());
				System.out.println("Employee Salary:    " + emp.getSalary());
				System.out.println("Employee UserName:  " + emp.getUser());
				System.out.println("Employee Password:  " + emp.getPassword() + "\n");
			}
			return "userpage";
		}

		return "message";
	}

	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("rd") int eid, Model m) {
		service.deleteEmployee(eid);
		List<Employee> allEmployee = service.getAllEmployee();
		m.addAttribute("records", allEmployee);
		return "successpage";

	}

	@RequestMapping("/edit")
	public String editEmployee(@RequestParam("rd") int eid, Model m) {
		Employee emp = service.editEmployee(eid);
		m.addAttribute("records", emp);
		return "update";

	}

	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp, Model m) {
		service.updateEmployee(emp);
		List<Employee> employee = service.getEmployee(emp.getUser(), emp.getPassword());
		m.addAttribute("records", employee);
		return "userpage";
	}
}