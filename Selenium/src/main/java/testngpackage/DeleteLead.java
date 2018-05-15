package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectMethods{
	@Test(dependsOnMethods= {"seleniumweek2day1classwork.CreateLeads.createLeads"})//(groups= {"sanity"},dependsOnGroups= {"smoke"})
	public void deleteLead() throws InterruptedException {
		
		click(locateElement("link","Leads"));
		click(locateElement("link","Find Leads"));
		click(locateElement("xpath","(//span[@class='x-tab-strip-inner']/span)[2]"));
		locateElement("name","phoneCountryCode").clear();
		//type(locateElement("name","phoneCountryCode"),"1");
		type(locateElement("name","phoneNumber"),"79");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		String leadId=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println(leadId);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("link","Delete"));
		click(locateElement("link","Find Leads"));
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[1]"),leadId);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		System.out.println(getText(locateElement("xpath","//div[text()='No records to display']")));

		



	}

}
