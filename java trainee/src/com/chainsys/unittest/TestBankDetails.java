package com.chainsys.unittest;
/** @ author chainsys-Aravind
 * created on 25/03/22
 */
import com.chainsys.variables.Bank;

public class TestBankDetails {
	
	public static void depositTest()
	{
		System.out.println("Before Deposit Current balance is : "+Bank.currentBalance);
		Bank.depositAmount(700);
		System.out.println("After Deposit Current balance is : "+Bank.currentBalance + "\n");
	}
	
	public static void withdrawtest()
	{
		System.out.println("Before transaction Current balance is : "+Bank.currentBalance);
		Bank.withdrawAmmount(7700);
		System.out.println("After transaction Current balance is : "+Bank.currentBalance+ "\n");
		
	}
	
	public static void openAccountTest()
	{
		Bank.openAccount("Aravintha prathi kumar",2429);
		System.out.println("Account Holder Name is :" +Bank.customerName);
		System.out.println("Account Number is :"+ Bank.accountNumber);
		
	}
	
	
}
