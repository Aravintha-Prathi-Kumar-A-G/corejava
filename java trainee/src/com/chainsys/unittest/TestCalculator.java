package com.chainsys.unittest;

/* this class is for init testing the 
 * @ author chainsys-Aravind
 * @ created on : 25/03/22
 */

import com.chainsys.variables.Calculator;

public class TestCalculator {
	
	public static void addTest()
	{
		//another method for passing parameters
   /* int arg1=100;
    * int arg2=50;
    * int output=Calculator.add(arg1,arg2);
    * System.out.println("answer="+output);
    */
		System.out.println(Calculator.add(5,8));
}
	
	public static void multiplyTest()
	{


		//another method for passing parameters
    int arg1=100;
    int arg2=50;
    int output=Calculator.multiply(arg1,arg2);
    System.out.println("answer="+output);
    
		//System.out.println(Calculator.multiply(5,8));
}
	public static void divideTest()
	{

		//another method for passing parameters
   /* int arg1=100;
    * int arg2=50;
    * int output=Calculator.divide(arg1,arg2);
    * System.out.println("answer="+output);
    */

		System.out.println(Calculator.divide(12,6));
}
	public static void subtractTest()
	{


		//another method for passing parameters
   /* int arg1=100;
    * int arg2=50;
    * int output=Calculator.subtract(arg1,arg2);
    * System.out.println("answer="+output);
    */
		System.out.println(Calculator.subtract(5,8));
}
}
