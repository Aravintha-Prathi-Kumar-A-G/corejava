package com.chainsys.introduction;


public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		taskA();
		taskB();
		taskC();

	}
	public static void taskA()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("whats your name");
		String name=sc.next();
		
		System.out.println(name);
		
	}
	public static void taskB()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		sc.close();
		int result = n*100;
		
		
		System.out.println(result);
		
	}
	
	public static void taskC()
	{
		String s1="100";
		String s2="25";
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println(z);
	}

}
