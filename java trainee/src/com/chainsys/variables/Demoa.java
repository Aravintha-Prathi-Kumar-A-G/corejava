package com.chainsys.variables;

//@ author Aravintha prathi kumar
//@ Date : 24/03/22
//@ place : chainsys
public class Demoa {

	
		// TODO Auto-generated method stub

		public static int DataA;//static global variable
		public final int DataB;//immutable global variable (not static)
		public final static int DataC=300;//constant
		private int dataD;//non static field
		//constructor
		
		/*
		 * constructor : is a special method
		 * the name of the constructor and the name of the class will be same
		 * constructor dont have return type
		 * constructors can take parameters
		 */
		public Demoa (int dataB)
		{
			//assigning value to the global read only field (this.DataB)
			this.DataB=dataB;
			
		}
		
		//static method can be called without an object
		public static void sayHello()
		{
			System.out.println("Hello Developer !!!");
			
		}
		//greetUser is a non static method
		
		public void greetUser()
		{
			System.out.println("Greetings USER !!!");
	}

}
