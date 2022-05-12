package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */

public class NoOfWordsAndStringReverse {
	public static void main (String args[]) 
	{
		 
	String string1 ="Tom and jerry are good friends";
	//split the string using space
	String[] wordSplit = string1.split(" ");
	//find the length of the string
	int wordcount = wordSplit.length;
	System.out.println("No of words  in the given String :  "+wordcount+" Words");
	   StringBuilder string2 = new StringBuilder();
	  string2.append(string1);
	  string2.reverse();//string builder using for reverse
    System.out.println("After Reverse the String : "+string2);
	
}
}
