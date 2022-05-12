package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */

import java.util.Scanner;

public class AlphabetsContains {

	public static void main(String[] args) {
	
		
	Scanner ag=new Scanner(System.in);
		 System.out.println("...Enter your Name...");
        String string1=ag.nextLine();
        //string changes into uppercase
        String name=string1.toUpperCase();
       char[] charname=name.toCharArray();
       //to find length of the string
        int lengthofString=charname.length;
       int asciiValue=0;
        for(int index=0;index<lengthofString;index++)
        {
                asciiValue=(int)charname[index];
        }
        if((asciiValue>65)||(90<asciiValue))
        {
        	System.out.println("----Name contains Alphabets-----");
        }
        else
        {
        	System.out.println("-----Name should be alphabets-----");
        }
        // check the length of the string is >=8
        if(lengthofString<8)
        {
                System.out.println("...Name should be greater than 8 characters...");
                return;
        }
        
        }
	}


