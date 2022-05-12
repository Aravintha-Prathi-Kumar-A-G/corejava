package com.chainsys.classandmethods;

/** 
 * this a class that contains employee related data
 * the person has id,name,city and salary properties
 * @author aravind chainsys
 * created on 25/03/2022
 *
 */
public class Employee {
 private final int empID;
	private String name;
	private String city;
	private long salary;

	//constructor 
	public Employee (int id)
	{
		//assigning value to read only field
		this.empID =id;
	}
	public String getName()
	{
		return name;
	}
public void setName (String name)
{
	this.name = name;
}
public int getEmpID()
{
	return empID;
}
public String getCity()
{
	return city;
} 
public void setcity(String city)
{
	this.city=city;
}
public long getSalary()
{
	return salary;
}
public void setSalary (long salary)
{
	this.salary=salary;
}

}
