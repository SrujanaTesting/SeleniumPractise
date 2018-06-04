package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class GuestProceed extends ProjectMethods {
	
	
	
	public GuestProceed()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='guest']")
	private WebElement guestproceed;
	public Summary guestProceed()
	{
		builder.moveToElement(guestproceed).pause(2000).click(guestproceed).build().perform();
		return new Summary();
	}

}
