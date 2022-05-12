package com.chainsys.variables;

/* @ author Chainsys-Venkst
 * created on : 25/03/22
 */

public class Calculator {
	/*
	 * Add method method : will take 2 values using the following parameters,
	 * and will add the values.The result of totaling will be returned back to the caller
	 * this is a static method, object reference is not required.
	 *  @ param param1 of type int
	 *   @ param param2 of type int
	 *   @ return type int
	 */

	public static int add(int param1, int param2)
	{
		int result =param1+param2;
		return result;
	}
	
	/*
	 * Multiply method method : takes 2 values using the following parameters,
	 * and will multiply the values.The product  result will be returned back to the caller
	 * this is a static method, object reference is not required.
	 *  @ param param1 of type int
	 *   @ param param2 of type int
	 *   @ return type int
	 */

	public static int multiply(int param1, int param2)
	{
		int result =param1*param2;
		return result;
	}
	
	/*
	 * division method method :  takes 2 integer values using the following parameters,
	 * and will division the values.The product result will be returned back to the caller
	 * this is a static method, object reference is not required.
	 *  @ param param1 of type int
	 *   @ param param2 of type int
	 *   @ return type int
	 */

	public static int divide(int param1, int param2)
	{
		if(param2==0)
		{
			System.out.println("value for parameter must not be zero");
        
		}
		int result =param1 / param2;
		return result;
	}
	
	/*
	 * Subtract method method : will take 2 values using the following parameters,
	 * and will subtract the values.The result of totaling will be returned back to the caller
	 * this is a static method, object reference is not required.
	 *  @ param param1 of type int
	 *   @ param param2 of type int
	 *   @ return type int
	 */

	public static int subtract(int param1, int param2)
	{
		int result =param1-param2;
		return result;
	}
}
