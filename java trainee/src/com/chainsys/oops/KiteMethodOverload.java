package com.chainsys.oops;

public class KiteMethodOverload {
	
	void fly (int distance)
	{
		System.out.println("FLY1 "+distance);
	}
	void fly (double time,int speed)
	{
		System.out.println("FLY1 "+time);
	}
	int fly (int time,int speed)
	{
		return time*speed;
	}
	void fall (String time)
	{
		System.out.println("FALL1 "+time);
	}
int fall (int distance)
{
	System.out.println("FALL2 "+distance);
	return distance;
}
 void glide(int time)
 {
	 System.out.println("glide1 "+time);
 }
 void glide(double time)
 {
	 System.out.println("Glide 2 "+time);
 }
}
