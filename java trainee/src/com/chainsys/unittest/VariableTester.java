package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

//@ author Aravintha prathi kumar
//@ Date : 24/03/22
//@ place : chainsys
/*Tester class for global variables
 * category to test Demoa class,its fields,and methods
*/

public class VariableTester {
	
	//Test static,constant,immutable varaiable
	
	public static void testGlobalvariables()
	{
		//display the value of static field
		//value is zero (default values)
		//DataA is accessed without creating an object
		System.out.println("DataA : "+Demoa.DataA);
		//display the value of immutable field
		//this is not possible without an object
		//System.out.println("DataB : "+Demoa.DataB);
		//display the value of constant field
		System.out.println("DataC : "+Demoa.DataC);
		//modifying value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("Data : "+Demoa.DataA);
		
		//modifying value of the static field DataC
		//ERROR : the final Demoa.DataC cannot be assigned
		//Demoa.DataC=2345;
	}
	
	public static void testImmutableVariable()
	{
		/* cannot make a static reference to the non-static field Demoa.Data
		//Demoa.DataB =123;
		 * first create an object of the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		
		Demoa firstObject=new Demoa(123);
		System.out.println(firstObject.DataB);
		/* value assigned to an immutable field can not be changed
		 * value for the immutaable field can be assigned only through the constructor
		 * */
		//   firstObject.DataB=567;
		
	}
	
	/* calling static method using class name
	 * without creating an object
	 * created on : 25 mar 2022
	 */

	public static void testStaticMethod()
	{
		Demoa.sayHello();
	}
	
	/* calling non-static method using object reference
	 * without creating an object,non-static methods can not be called
	 * created on : 25 mar 2022
	 */

	public static void testNonStaticMethod()
	{
		// Error :
		
		//Demoa.greetUser();
		Demoa firstObject =new Demoa(111);
		//call the non static method
		firstObject.greetUser();
	}
}
