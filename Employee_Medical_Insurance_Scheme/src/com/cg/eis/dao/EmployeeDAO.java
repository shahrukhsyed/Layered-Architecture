package com.cg.eis.dao;


import java.util.Map;

import com.cg.eis.bean.Employee;

public interface EmployeeDAO {
    public boolean addEmployee(Employee emp);
    public boolean deleteEmployee(int l);
    public Employee findEmployee(int id);
    public Map<Integer,Employee> printEmpDetails(); 
    public String generateScheme( String desg,double sal);
}
