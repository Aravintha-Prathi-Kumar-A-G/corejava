package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */

import java.util.Scanner;

public class EvenDigitFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner ag=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		long value=ag.nextLong();
		ag.close();
		long number=value;
		long remainder=0;
		while(number>0)
		{
			remainder=number%10;
			if(remainder%2==0)
			{
				System.out.println("Even Number in the given Numbers ="+remainder);
				
			}
			number=number/10;


	}
	
}
}



	


