package com.chainsys.variables;

/** @ author chainsys-Aravind
 * created on 25/03/22
 */
import java.util.Scanner;

public class Bank {
	
	public static int currentBalance=5000;
	public static String customerName;
	public static int accountNumber;
	

	public static int depositAmount(int amount)
	{
			currentBalance =currentBalance+amount;
			return currentBalance;
		}
		
	
	public static int withdrawAmmount(int withdraw)
	{
		if(withdraw>currentBalance)
		{
			System.out.println("your withdraw amount is more than current balance please check Current Balance & retry");
		}
		else
		{
		currentBalance =currentBalance-withdraw;
		}
		return currentBalance;
		
	}
	
	public static void openAccount(String parname , int paraAccountNumber)
	{
		customerName = parname;
		accountNumber = paraAccountNumber;
	}
}
