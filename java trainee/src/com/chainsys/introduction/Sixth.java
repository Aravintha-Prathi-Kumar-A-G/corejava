package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//userName();
		//findEvenNumbers();
		swapNum();
	}
	
	public static void userName()
	{
		Scanner sg=new Scanner(System.in);//input stream
		//prompt a msg in the display console
		System.out.println("enter your name");
		//get name from the keyboard (input device,and store the name in a local variable)
String name= sg.nextLine();	
		sg.close();//closing the input stream
		//streams are created & managed by the os.scanner is just a handle
		System.out.println("name is="+name);//display the input value received
	char[] nameAsCharacters =name.toCharArray();
	int lengthofCharArray=nameAsCharacters.length;
	System.out.println("length of your name is : " +lengthofCharArray);
	if(lengthofCharArray <3)
	{
		System.out.println("Name must have atleast 3 chars");
		return;
	}
	if(lengthofCharArray >15)
	{
		System.out.println("Name must not have more than 15 chars");
		return;
	}
	//ascii value for Alphabets is 65 to 90 for UPPER CASE
	String nameInUppercase =name.toUpperCase();
	//remove blank space before, and after the name
	nameInUppercase =nameInUppercase.trim();
	char[] uppercaseCharArray = nameInUppercase.toCharArray();
	lengthofCharArray = uppercaseCharArray.length;
	int asciiValue =0;
	for(int index=0;index<lengthofCharArray;index++)
	{
		asciiValue = (int) uppercaseCharArray[index];
	System.out.println("Ascii : "+asciiValue);
	if (asciiValue <65 || asciiValue > 90)
	{
		if (asciiValue !=32)
		{
			System.out.println("In valid character in Name : ");
		return;
		}
	}
	}
	}
	
	public static void findEvenNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY 10 DIGIT NUMBER");
		long value=sc.nextLong();
		sc.close();
		long n=value;
		long r=0;
		while(n>0)
		{
			r=n%10;
			if(r%2==0)
			{
				System.out.println(r);
				
			}
			n=n/10;
		}
	}
	
	public static void swapNum()
	{
		int x=67;
		int y=92;
		System.out.println("x:="+x + "y :"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:="+x + "y :"+y);
		
	}
}



