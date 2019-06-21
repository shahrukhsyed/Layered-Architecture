package com.cg.eis.dao;

import java.util.*;

import com.cg.eis.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	Map<Integer, Employee> empList = new HashMap<>();
	@Override
	public boolean addEmployee(Employee emp) {
        try{
            
            double sal = emp.getEmpSalary();
            String desg = emp.getEmpDesg();
            String scheme = generateScheme(desg,sal);
            if(scheme != null){
                emp.setEmpScheme(scheme);
            }else{
                return false;
            }
            empList.put(emp.getEmpId(), emp);
            
            return true;
        }catch(NullPointerException e){
            return false;
        }
    }
	
	
	@Override
	public Map<Integer, Employee> printEmpDetails() {
		// TODO Auto-generated method stub
		return empList;
	}
	@Override
	public boolean deleteEmployee(int l) {
		try{
            empList.remove(l);
            return true;
        }catch(NullPointerException e){
            return false;
        }
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return empList.get(id);
	}
	
	
	public String generateScheme(String desg,double sal){
        if((sal>=5000.00 && sal<20000.00) && desg.equalsIgnoreCase("System Associate")){
                return "Scheme C";
            }else if((sal>=20000.00 && sal<40000.00) && desg.equalsIgnoreCase("Programmer")){
                return "Scheme B";
            }else if((sal>=40000.00) && desg.equalsIgnoreCase("Manager")){
                return "Scheme A";
            }else if((sal<5000.00) && desg.equalsIgnoreCase("Clerk")){
                return "No Scheme";
            }else{
                System.out.println("Invalid salary and Designation");
                return null;
            }
    }
		
}
