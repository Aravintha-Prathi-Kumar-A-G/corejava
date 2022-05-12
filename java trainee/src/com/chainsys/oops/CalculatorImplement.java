package com.chainsys.oops;
/**
 *  @ author Araind chainsys
 *  java implement assingment
 *  19-04-2022
 */

public class CalculatorImplement implements Icalculator 
{
	@Override
	public  int add(int v1,int v2)
	{
		int x=v1+v2;
		return x;
	
	}
	@Override
    public  int multiply(int v1,int v2) 
    {
	
    	int x=v1*v2;
    	return x;
			
    }
	@Override
    public  int divide(int v1,int v2) //throws ArithmeticException
    {
		if(v2==0)
		{
			throw new ArithmeticException("value 2 must be greater than 0"); 
		}
		else
		{
    	int x=v1/v2;
    	return x;
    }
    }
}
