package com.chainsys.classandmethods;
/** @ author chainsys Aravind
 * created on 25/03/2022
 */
public class Movies {
	
	private  String movieName;
	private int ticketNumber;
	private int dateOfRelease;
	private int ticketPrice;
	private String theatreName;
	

	public Movies (String moviename)
	{
		this.setMovieName(moviename);
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public int getDateOfRelease() {
		return dateOfRelease;
	}
	public void setDateOfRelease(int dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	

}
