package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectMethods{
	@Test//(groups= {"sanity"})
	public void duplicateLead() {
		click(locateElement("link","Leads"));
		click(locateElement("link","Find Leads"));
		click(locateElement("xpath","//span[@class='x-tab-strip-inner']/span[text()='Email']"));
		type(locateElement("xpath","(//div[@class='x-form-item x-tab-item']//following::input)[5]"),"@");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")));
		String firstName=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		System.out.println(firstName);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		click(locateElement("link","Duplicate Lead"));
		verifyExactText(locateElement("id","sectionHeaderTitle_leads"),"Duplicate Lead");
		click(locateElement("xpath","//input[@value='Create Lead']"));
		verifyExactText(locateElement("id","viewLead_firstName_sp"),firstName);
		

	}

	
}
