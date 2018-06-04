
package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MovieSelect;
import wdMethods.ProjectMethods;

public class MovieBook extends ProjectMethods {
	
	@BeforeTest
	public void setData()
	{
		testCaseName="TC001_BookMovie";
		testDescription="Book 2 Tickets";
		testNodes="Ticket Booking";
		category="Functional";
		authors="srujana";
		browserName="chrome";
		
	}
	@Test
	public void bookMovie()
	{
		new MovieSelect()
		.selectMovie()
		.printClass()
		.timeSelect()
		.skip()
		.seatSelect()
		.next()
		.guestProceed()
		.verifyTickets();
	}
	
	}


