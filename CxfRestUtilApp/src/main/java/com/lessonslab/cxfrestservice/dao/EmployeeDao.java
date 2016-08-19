package com.lessonslab.cxfrestservice.dao;

import java.util.ArrayList;
import java.util.List;

import com.lessonslab.cxfrestservice.model.Employee;

public class EmployeeDao 
{
	
	public List<Employee> getEmployeeDetails(String employeeId) throws Exception{
		List<Employee> empList = new ArrayList<Employee>();
		
			System.out.println("Employee ID is:: "+employeeId);
			Employee emp = new Employee();
			emp.setDateOfJoining("01-02-2001");
			emp.setDepartment("Sales");
			emp.setEmail("test@example.com");
			emp.setEmployeeId("123456");
			emp.setFirstName("Pete");
			emp.setLastName("Smith");
			empList.add(emp);
		if(employeeId.equals("12345")) {
			return empList;
		} else if(employeeId.equals("*")){
			Employee emp1 = new Employee();
			emp1.setDateOfJoining("01-02-2001");
			emp1.setDepartment("Sales");
			emp1.setEmail("test@example.com");
			emp1.setEmployeeId("123457");
			emp1.setFirstName("John");
			emp1.setLastName("Simpson");	
			empList.add(emp1);
			return empList;
		}else {
			throw new Exception("Employee not found");
		}
		
		
	}
}
