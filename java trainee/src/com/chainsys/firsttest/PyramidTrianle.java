package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */

public class PyramidTrianle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row, column, dot,right;
       //this outer loop handles number of rows
		for ( row= 1; row <= 9; row++)
        {
           //this inner loop handles number of dots
            for (dot = 1; dot<= 9 - row; dot ++) 
            {
            	System.out.print(".");
            	} 
            //this inner loop handles number of columns
            //intialize numbers from row minus 
            for (column = row; column >= 1; column--)
            {
            	//to create left half pyramid
            	//print numbers between row decrement to 1
                System.out.print(column);
            }
            for ( right = 2; right <= row; right++)
            {
            	//to create right half pyramid
            	//print number from 2 to row
            	System.out.print(right);
            	}
            //ending line after each row
            System.out.println(); 
            
            } 
		
        }
       
    }



	


