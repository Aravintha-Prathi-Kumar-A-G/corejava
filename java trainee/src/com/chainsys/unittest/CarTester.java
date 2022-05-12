package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {

	public static void testCar()
	{
		Car firstCar=new Car("TN 10A 2429");
		firstCar.setColor("Red");
		firstCar.setFuel("petrol");
	firstCar.setYearOfPurchase(2022);
	System.out.println(firstCar.getReqNo());
	System.out.println(firstCar.getColor());
	System.out.println(firstCar.getFuel());
	System.out.println(firstCar.getYearOfPurchase());
	}
}
