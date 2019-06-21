package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAOImpl;

public class EmployeeService implements EmployeeServiceInterface{

	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	
	@Override
	public boolean addEmployee(Employee e) {
		return dao.addEmployee(e);
	}

	@Override
	public boolean deleteEmployee(int l) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(l);
	}
	@Override
	public Map<Integer,Employee> getAllAccount() {
		return dao.printEmpDetails();
	}

	public String generateScheme(String desg, double sal) {

		return dao.generateScheme(desg, sal);
	}

	@Override
	public Employee findEmployee(int id) {
				return dao.findEmployee(id);
	}

}
