package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class TestEmployee {
	
	public static void testEmployeeName()
	{
		 Employee firstEmployee = new  Employee (2429);
		firstEmployee.setName("Aravind");
		 System.out.println(firstEmployee.getName());
		
	}

	public static void testCity()
	{
		Employee firstEmployee = new Employee(2429);
	firstEmployee.setcity("Madurai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary()
	{
		Employee firstEmployee = new Employee(2429);
		firstEmployee.setSalary(20000);
			System.out.println(firstEmployee.getSalary());
		
	}
}
