package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */
import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ag=new Scanner(System.in);
		 System.out.println("...Enter a 3 Digit Number...?");
         int number=ag.nextInt();
         ag.close();
         int remainder;
         //double store=0;
         int store=0;
         int number1=number;
         while(number>0)
         {
        	 remainder=number%10;
        	 store =  (int) (Math.pow(remainder,3)+store);
        	 number=number/10;
         }
         if(number1==store)
         {
        	 System.out.println("Same as input Number");//Armstrong number
         }
         else
         {
        	 System.out.println("Different Number");//Not a Armstrong number
         }
	}

}
