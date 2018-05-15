package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MergeLeads extends ProjectMethods {
	@Test//(invocationTimeOut=20)
	// timeOut is maximum number of milliseconds for each invocation of test and invocationTimeOut is maximum number of milliseconds for all invocations together//(groups= {"sanity"},dependsOnGroups= {"smoke"})
	public void mergeLeads() throws InterruptedException{
		
		click(locateElement("link","Leads"));
		click(locateElement("link","Merge Leads"));
		click(locateElement("xpath","(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[1]"),"11");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		String number=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(number);
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);

		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[1]"),"10");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		clickWithoutSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		switchToWindow(0);

		clickWithoutSnap(locateElement("link","Merge"));
		acceptAlert();
		click(locateElement("link","Find Leads"));
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[1]"),number);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(4000);
		System.out.println(getText(locateElement("xpath","//div[text()='No records to display']")));

		
	}
}
