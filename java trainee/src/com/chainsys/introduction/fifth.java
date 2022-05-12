package com.chainsys.introduction;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//printNumberTentoZero();
		//printMatrix();
		printTriangle();
		printTriangleB();
	}
	public static void printnumberoneto100()
	{
		int i=0;
		for(i=0;i<=100;i++)
		{
			System.out.println(i + " ");
	}
}
	{
		int i=0;
		for(i=0;i<=100;i++)
		{
			System.out.println(i + " ");
	}
}
	
	public static void printNumberTentoZero()
	{
		int i=0;
		for(i=10;i>=1;i--)
		{
			System.out.println(i + " ");
			
	}
}
	//nested for loop
	public static void printMatrix()
	{
		int countA=0,countB;
		for(countA=1;countA<=5;countA++)
		{
			for(countB=11;countB<=20;countB++)
			{
			System.out.print(countB + " ");
			}
			System.out.println();
	}
	}
	
	public static void printTriangle()
	{
		int countA=0,countB;
		for(countA=1;countA<=10;countA++)
		{
			for(countB=1;countB<=countA;countB++)
			{
			System.out.print(countB + " ");
			}
			System.out.println();
	}
	}
	
	public static void printTriangleB()
	{
		int countA=0,countB;
		for(countA=1;countA<=10;countA++)
		{
			for(countB=1;countB<countA;countB++)
			{
			System.out.print(".");
			}
			for(int countC =countA;countC>=1;countC--)
			{
			System.out.print(countC);
	}
			System.out.println();
		}
	}
}

	
