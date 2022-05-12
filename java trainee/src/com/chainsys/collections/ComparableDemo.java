package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {
	
	public static void sortComparableEmp()
	{
		EmpComparable e1=new EmpComparable(100);
		e1.Name="Sam";
		EmpComparable e2=new EmpComparable(200);
		e2.Name ="Musk";
		EmpComparable e3=new EmpComparable (300);
		e3.Name ="Jobs";
		List<EmpComparable> empList =new ArrayList <>();
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
		// System.out.println(empList);
		Iterator<EmpComparable> emp_iterator =empList.iterator();
		while(emp_iterator.hasNext())
	    {
	        System.out.println(emp_iterator.next().getID());
	    }
	    Collections.sort(empList);
	    System.out.println("----------------------");
	    emp_iterator=empList.iterator();
	    while(emp_iterator.hasNext())
	    {
	        System.out.println(emp_iterator.next().getID());
	    }
		
		
	}

}
