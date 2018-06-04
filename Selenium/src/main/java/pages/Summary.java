package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Summary extends ProjectMethods {

	public Summary()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='tket-count']/b")
	private WebElement verifytickets;
	public Summary verifyTickets()
	{
		
		if(Integer.parseInt(getText(verifytickets))==2)
				System.out.println(getText(verifytickets)+" tickets are selected");
		else
				System.out.println(getText(verifytickets)+" tickets are not selected");
		
		return new Summary();
	}
}
