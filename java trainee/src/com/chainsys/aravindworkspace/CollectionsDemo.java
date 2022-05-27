package com.chainsys.aravindworkspace;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {
	
	public static void main (String args[])
	{
		//arraylistString();
		//arraylistInteger();
		removeUsingIterator();
	}
		
		public static void arraylistString()
		{
			  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
			      list.add("Mango");//Adding object in arraylist    
			      list.add("Apple");    
			      list.add("Banana");    
			      list.add("Grapes");  
			      list.add("Aravind");
			      //Printing the arraylist object   
			      System.out.println(list);  
		
			 }  
		
		public static void arraylistInteger()
		{
			ArrayList<Integer> alist=new ArrayList <Integer>();
			alist.add(1);
		alist.add(2);
		alist.add(3);
		Integer i;
			System.out.println(alist);
		for( i=4;i<=15;i++)
			{
			alist.add(i);	
			}
		System.out.println(i);
		System.out.println(alist.get(5));
			
		}
		
		 public static void removeUsingIterator() {
			    ArrayList<Integer> numbers = new ArrayList<Integer>();
			    numbers.add(12);
			    numbers.add(8);
			    numbers.add(2);
			    numbers.add(23);
			    numbers.add(100);
			    numbers.add(1);
			    numbers.add(10);
			    numbers.remove(0);
			    numbers.set(5, 999);
			    System.out.println(numbers.get(5));
			    System.out.println(numbers.contains(100));
			    Iterator<Integer> it = numbers.iterator();
			    while(it.hasNext()) 
			    {
			      Integer i = it.next();
			      if(i <=10) {
			        it.remove();
			      }
			    }
			    System.out.println(numbers);
			  }
	}

