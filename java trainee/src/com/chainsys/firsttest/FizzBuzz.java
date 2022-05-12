package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index;
		index=0;
		while ( index <=100)
		{
			if ((index%3==0)&&(index%5==0))
			//if((index%15==0)) 
			{
				System.out.print(index+"FizzBuzz  ");
				
			}
			else if (index%3==0)
			{
				System.out.print(index+"Fizz  ");	
			}
			
			else if (index%5==0)
			{
				System.out.print(index+"Buzz  ");	
			}
			
			else 
			{
				System.out.print(index+"  ");
			}
			index++;
	}

	}
	}

