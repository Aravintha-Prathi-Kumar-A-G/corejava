package com.chainsys.firsttest;
/** @ author chainsys Aravind
 * created on 30/03/2022
 * SUB : First TEST
 */
import java.util.Scanner;

public class RainAndTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ag=new Scanner(System.in);
		 System.out.println("...Is it Raining...?");
		 System.out.println("...Type raining or not ...");
       String string1 =ag.nextLine();
      
     // System.out.println(string1.contains("raining")+"   Get an Umbrella with you");
      
       // string contains method searches sequenxe of character in the string.
       // it returns true or false.
       if(string1.contains("raining"))
       {
       System.out.println("---Get an Umbrella with you---");
	}
       else if (string1.contains("not"))
       {
    	   System.out.println(" ---Walk Safe---");   
       }
       else
       {
    	   System.out.println(" ---Give valid input---");
    	   return;
       }
       // temperature
       System.out.println("...Enter Today Temperature...");
       int temp =ag.nextInt();
       ag.close();
       
       if (temp<32)
       {
    	 System.out.println("---Bring a Heavy Jacket---");  
       }
       else if((temp==32)||(temp<=50))
       {
    	   System.out.println("---Bring a Light Jacket---");   
       }

       else
       {
    	   System.out.println("---There is no Use of Jacket---");  
       }
}
}