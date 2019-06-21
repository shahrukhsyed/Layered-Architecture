package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface EmployeeServiceInterface {
    public boolean addEmployee(Employee emp);
    public boolean deleteEmployee(int l);
    public Employee findEmployee(int id);
    public String generateScheme(String desg, double sal);

	public default void printStatement(Employee e)
	{
		System.out.println("======================================");
		System.out.println("Employee Name:"+e.getEmpName());
		System.out.println("Employee Id:"+e.getEmpId());
		System.out.println("Employee salary:"+e.getEmpSalary());
		System.out.println("Employee Designation:"+e.getEmpDesg());
		System.out.println("Employee Allocated Insurance Scheme:"+e.getEmpScheme());
		System.out.println("======================================");
	}
	public Map<Integer, Employee> getAllAccount();
}
