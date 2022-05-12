package com.chainsys.introduction;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenNumber();
		

	}
	public static void evenNumber()
	{
		int i;
		for(i=1;i<=100;i++) {
			if(i%2==0)
			{
				System.out.println("even numbers="+i);
			}
		}
	}

}
