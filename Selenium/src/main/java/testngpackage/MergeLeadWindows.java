package testngpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeadWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximise the url
		driver.manage().window().maximize();

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//provide the login details
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Thread.sleep(5000);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Merge Leads").click();;
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		 Set<String> allWindows = driver.getWindowHandles();
		 for(String eachWindow:allWindows)
		 {
			 System.out.println(eachWindow);
		 }
		 List<String> allWin = new ArrayList<String>();
		 allWin.addAll(allWindows);
		 driver.switchTo().window(allWin.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[1]").sendKeys("11");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		String number = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText());
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//holded
		 driver.switchTo().window(allWin.get(0));
		 System.out.println(driver.getTitle());
		 driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		 Set<String> allWindows1 = driver.getWindowHandles();
		 for(String eachWindow:allWindows1)
		 {
			 System.out.println(eachWindow);
		 }
		 List<String> allWin1 = new ArrayList<String>();
		 allWin1.addAll(allWindows1);
		 driver.switchTo().window(allWin1.get(1));
		System.out.println(driver.getTitle());

		driver.findElementByXPath("(//div[@class='x-form-element']/input)[1]").sendKeys("10");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
				System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText());
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
//holded
		 driver.switchTo().window(allWin.get(0));
		 driver.getTitle();
		 driver.findElementByLinkText("Merge").click();
		 driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(number);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		System.out.println(driver.findElementByXPath("//div[text()='No records to display']").getText());
		driver.close();

		 //driver.findElementByLinkText("Merge").click();
		 
		
		 
		 
		 
		 
		
		
	}

}