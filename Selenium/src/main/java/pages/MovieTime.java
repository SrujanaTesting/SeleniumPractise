package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MovieTime extends ProjectMethods {
	public MovieTime()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//section[@class='cinema-exp']/h3")
	private List<WebElement> printclass;
	public MovieTime printClass()
	{
		for(int i=0;i<2;i++) {
		System.out.println(getText(printclass.get(i)));
		}
		return new MovieTime();
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='mshowtime']/..")
	private WebElement timeselect;
	public Skip timeSelect()
	{
		builder.moveToElement(timeselect).pause(2000).click(timeselect).build().perform();
		return new Skip();
	}

}
