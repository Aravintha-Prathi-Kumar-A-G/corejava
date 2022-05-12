package com.chainsys.exceptions;

import java.util.Scanner;

public class NestedTry {

	static String[] data;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		int numValue=0;
		data =new String[5];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner (System.in);
			try
			{
				System.out.println("Enter value for X");
				data[6]=sc.nextLine();//  123--abcd-----123
				numValue =Integer.parseInt(data[0]); //data[2]
				System.out.println("The Square is "+numValue * numValue);	
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a Number! ");
			}
			num=data.length;
			System.out.println("Array length "+num);
		}
		catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBounds-No Arguments given !!! ");
		}
		catch (Exception er)
		{
			System.out.println("Exception "+er.getMessage());
		}
	}
	
	
	public static void m4()throws Exception
	{
		Exception e1=new Exception ("Error 1");
		//Inner Exception
		//e1 is nested inside e2
		Exception e2=new Exception ("Error 2",e1);
		throw e2;
	}
public static void testM4()
{
	         //m4();
			try
			{
				m4();
			}
			catch(Exception e)
			{
				System.out.println("Inside Catch "+e.getMessage());
	           Throwable t1=e.getCause();
	           System.out.println("Cause "+t1.getMessage());
			}
}
}
