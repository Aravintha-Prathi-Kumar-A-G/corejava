package com.chainsys.strings;
/** @ author chainsys Aravind
 * created on 28/03/2022
 */

public class StringLessonA {

	public static void lessonOne()
	{
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[]={'c','h','a','i','n'};
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString =new String (new char[] {'c','h','a','i','n'});
		System.out.println(thirdString);
	}
	
	public static void lessonTwo()
	{
		String firstString ="Hello";
		String secondString = "Hello";
		String thirdString ="Hello";
		int firstNumber =100;
		int secondNumber =100;
		int thirdNumber =100;
		System.out.println(firstString);
		System.out.println(secondString);
	firstString = "Welcome";
	System.out.println(firstString);
	System.out.println(secondString);
	
	}
	
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
				{
			String s1="Hello";
				}
	}
	
	public static void stringToCharArray()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength =firstString.length();
	System.out.println("Length :"+stringlength);
	char [] data=firstString.toCharArray();
	int dataarraylength = data.length;
	System.out.println("length : "+dataarraylength);
	}
	
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();
		//string in firststring is not modified,because strings are immutable
		System.out.println("TO UPPER CASE :"+stringInUppercase);
		System.out.println("s1"+firstString);
		String stringInLowercase = firstString.toLowerCase();
		System.out.println("TO LOWER CASE :"+stringInLowercase);
		System.out.println("s1="+firstString);
		//substring
		//from the 4th char till end
		String substring=firstString.substring(3);
		System.out.println(substring);
		//from 3rd char to 6th char (i.e excluding 7th char)
		//from index 2 to index 5
		substring =firstString.substring(2,6);
		System.out.println(substring);
		//replace
		String replacedstring = firstString.replace('a','e');
		System.out.println(replacedstring);
		//equals
		boolean flaq1 = firstString.equals(stringInUppercase);//false
		System.out.println(flaq1);
		//equalsIgnorecase
		boolean flaq = firstString.equalsIgnoreCase(stringInUppercase);//
		System.out.println(flaq);
	}
	
	public static void testStringTrim()
	{
		
		
		String secondstring="Hope it    rain     ";
      	System.out.println("Before Trim :"+secondstring.length());
     	secondstring = secondstring.trim();
		System.out.println("After  Trim :"+secondstring.length());
		
}
	
	public static void testSplit()
	{
		String firstString =" 	Tom and jerry are good friends	";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("word count "+count);
		for (int index =0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}
	
	public static void testSplitDays()
	{
		String weekdays ="mon/tue/wed/thu/fri/sat/sun";
		String trimmedString = weekdays.trim();
		String[] data = trimmedString.split("/");
		int count = data.length;
		System.out.println("word count "+count);
		for (int index =0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}
	
	//Write code to reverse a String
	public static void reverse()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence="";
		String sentence1="";
		try
		{
			sentence = scanner.nextLine();
		}
		finally
		{
			scanner.close();
		}
		
		
		
		
		char[] charsen=sentence.toCharArray();
		int length = charsen.length;
		for (int index=length-1;index>=0; index--)
      {
       
        sentence1= sentence1+charsen[index]; 
      }
      System.out.println("Reversed word: "+ sentence1);
    
	}

	public static void verifyString (String s1)//verify and print
	{
		if(null==s1)
		{
			System.out.println("String is Null");
		return;
		}
		else
		{
			System.out.println("String is not Null"+s1);
		}
		
		if(!s1.isEmpty())
		{
			System.out.println("\t NOT empty"+s1);
			
		}
		else
		{
			System.out.println("\t String is empty");
		}
	}
	
}



