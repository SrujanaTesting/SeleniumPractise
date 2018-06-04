package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Skip extends ProjectMethods {

	public Skip()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()[contains(.,'SKIP & PROCEED')]]")
	private WebElement skip;
	public SeatSelect skip()
	{
builder.moveToElement(skip).pause(2000).click(skip).build().perform();
return new SeatSelect();
	}
}
