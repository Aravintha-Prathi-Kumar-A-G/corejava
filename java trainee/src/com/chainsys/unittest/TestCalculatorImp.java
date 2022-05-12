package com.chainsys.unittest;
/**
 *  @ author Araind chainsys
 *  java implement assingment
 *  19-04-2022
 */

import com.chainsys.oops.CalculatorImplement;
import com.chainsys.oops.Icalculator;

public class TestCalculatorImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icalculator obj= new CalculatorImplement();
		System.out.println("Caluculator Addition of two values ="+obj.add(2,8));
		System.out.println("Caluculator Multiplication of two values ="+obj.multiply(2,8));
		System.out.println("Caluculator Division of two values ="+obj.divide(16,0));

	}

}
