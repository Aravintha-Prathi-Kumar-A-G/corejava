package com.chainsys.unittest;
/** @ author chainsys Aravind
 * created on 25/03/2022
 */
import com.chainsys.classandmethods.Movies;

public class MovieTester {

	public static void testMovie()
	{
		Movies firstMovie=new Movies("KGF-2");
		firstMovie.setMovieName("KGF-2");
		firstMovie.setDateOfRelease(2022);
		firstMovie.setTheatreName("Carnival Cinemas");
		firstMovie.setTicketNumber(24);
		firstMovie.setTicketPrice(250);
		System.out.println("Movie name :"+firstMovie.getMovieName());
		System.out.println(firstMovie.getDateOfRelease());
		System.out.println(firstMovie.getTheatreName());
	    System.out.println(firstMovie.getTicketNumber());
	    System.out.println(firstMovie.getTicketPrice());
	}
}
