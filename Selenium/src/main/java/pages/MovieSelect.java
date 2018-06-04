package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MovieSelect extends ProjectMethods {
	
	public MovieSelect()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//section[@onclick[contains(.,'deadpool')]]//img[@class='img-responsive']")
	private WebElement movieselect;
	public MovieTime selectMovie()
	{
		builder.moveToElement(movieselect).pause(2000).click(movieselect).build().perform();
		return new MovieTime();
	}

}
