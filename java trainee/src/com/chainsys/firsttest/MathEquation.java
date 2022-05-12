package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */
import java.util.Scanner;

public class MathEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//  the equation 2x2 + x + 5 for all numbers between 5 and 10 for x
		int index=5;
		while(index<=10)
		{
               long equation=((2*(index*index))+index+5);
              
              System.out.println("For Number : "+index+" The equation is : "+equation);
        index++;      
		}
      }
}
	


