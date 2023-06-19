package com.thenext.app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRunner {
	public static void main(String[] args) {

		
   
// how many male and female  employees are there in organizations.		
		List<Employee> employess = EmployeeDB.getEmployess();

		Map<String, Long> noOfMaleAndFemaleEmployee = employess.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(noOfMaleAndFemaleEmployee);
		
		
	//print all the name of department
		
		 List<String> nameOfDepartment = employess.stream()
		           // .map(emp->emp.getDepartment())
				    .map(Employee::getDepartment)
		            .distinct()
		            .collect(Collectors.toList());
		            System.out.println(nameOfDepartment);
		            
		            
		            
	//What is the average age of male and female employees?
		            
		           
		                     
		                    	 
		                    

	}

}