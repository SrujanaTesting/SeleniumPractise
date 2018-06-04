package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SeatSelect extends ProjectMethods {

	public SeatSelect()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//li[text()='G']/following-sibling::li[@class='rc-availableseat']/a")
	private List<WebElement> seats;
	public SeatSelect seatSelect()
	{
		for(int i=0;i<2;i++)
		{
			builder.moveToElement(seats.get(i)).pause(2000).click(seats.get(i)).build().perform();;
		}		return new SeatSelect();
	}
	

	@FindBy(how=How.XPATH,using="//a[text()[contains(.,'NEXT')]]")
	private WebElement next;
	public GuestProceed next()
	{
		builder.moveToElement(next).pause(2000).click(next).build().perform();
		return new GuestProceed();
	}
	
}
