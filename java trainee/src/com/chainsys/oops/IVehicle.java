package com.chainsys.oops;

public interface IVehicle {
	//constant
	
	public final int MAXSPEED=150;
	abstract void echo ();
	abstract void start ();
	abstract void move ();
	abstract void  stop();

	/**
	 * All interfaces are constant, and markers
	 * null interface can be only markers,not a contract
	 */

}

interface IPetrol
{
	
}