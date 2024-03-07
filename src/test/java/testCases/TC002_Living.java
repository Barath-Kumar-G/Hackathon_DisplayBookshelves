package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.chairs_living;
import testBase.BaseClass;

public class TC002_Living extends BaseClass{
	
	@Test(priority=1,groups= {"sanity","master"})
	public void viewLiving() throws InterruptedException {
		chairs_living l= new chairs_living(driver);
		logger.info("------Mouse hovering to the header Living-------");
		l.HoverToLiving();
	}
	@Test(priority=2,groups= {"master"})
	public void prntSubmenu() throws IOException, InterruptedException {
		chairs_living l= new chairs_living(driver);
		logger.info("------Printing the menu list of seating&chairs-------");
		l.seatingAndChairs();
	}

}
