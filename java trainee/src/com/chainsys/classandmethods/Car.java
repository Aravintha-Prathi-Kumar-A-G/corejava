package com.chainsys.classandmethods;
/** @ author Chainsys Aravind
 * Created on 25/03/2022
 * @author arav3116
 *
 */
public class Car {
	
	private final String reqNo;
	private int yearOfPurchase;
	private String color;
	private String fuel;
	
	public Car(String rno )
	{
		this.reqNo=rno;
	}

	public String getReqNo() {
		return reqNo;
	}

	public int getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
