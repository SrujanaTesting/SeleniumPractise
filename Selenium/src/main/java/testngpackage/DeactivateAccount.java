package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeactivateAccount extends ProjectMethods{
	@Test
	public void deactivateAccount() throws InterruptedException
	{
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//label[text()='Account ID:']/following::input)[1]"), "11435");
		type(locateElement("xpath", "(//label[text()='Account ID:']/following::input)[2]"), "Manju@001");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		String text = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(text);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(verifyTitle("Account Details | opentaps CRM"));
		clickWithoutSnap(locateElement("xpath","//a[text()='Deactivate Account']"));
		System.out.println(getAlertText());
		acceptAlert();
		verifyPartialText(locateElement("xpath","//span[@class='subSectionWarning']"), "This account was deactivated as of");
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//label[text()='Account ID:']/following::input)[2]"), "Manju@001");
		type(locateElement("xpath", "(//label[text()='Account ID:']/following::input)[1]"), text);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
		closeBrowser();
		

		
		
	}

}
