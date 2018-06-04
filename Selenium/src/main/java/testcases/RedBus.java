package testcases;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBus {

	@Test
	public void redbus() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srujana\\git\\pushing\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		List<WebElement> pages = driver.findElementsByXPath("//a[contains(@class,'page_link1')]");
		System.out.println(pages. size());
		pages.get(1).click();
		pages.get(2).click();*/
		driver.get("https://www.redbus.in/");
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");*/
		driver.findElementByXPath("//input[@id='src']").sendKeys("Bangalore",Keys.ENTER);
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Chennai",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//label[@for='onward_cal']").click();
		WebElement onwardtable = driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']/table");
		List<WebElement> onwardrows = onwardtable.findElements(By.tagName("tr"));
		List<WebElement> onwardcolumns = onwardrows.get(6).findElements(By.tagName("td"));
		onwardcolumns.get(1).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//label[@for='return_cal']").click();
		WebElement returntable = driver.findElementByXPath("//div[@id='rb-calendar_return_cal']/table");
		List<WebElement> returnrows = returntable.findElements(By.tagName("tr"));
		List<WebElement> returncolumns = returnrows.get(6).findElements(By.tagName("td"));
		returncolumns.get(3).click();
		Thread.sleep(5000);
		//driver.getKeyboard().sendKeys(Keys.ENTER);
		driver.get("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&toCityName=Chennai&toCityId=123&onward=29-May-2018&return=31-May-2018&opId=0&busType=Any");
		driver.findElementByXPath("//div[text()[contains(.,'BUS TYPES')]]").click();
		List<WebElement> checkboxes = driver.findElementsByXPath("//li[@class='checkbox']//label[@class='custom-checkbox']");
		for(int i=0;i<4;i++)
		{
			checkboxes.get(i).click();
		}
		//driver.findElementByXPath("//label[text()='Asian Xpress']/preceding-sibling::input").click();
		driver.findElementByXPath("//button[@class='button done']").click();
		List<WebElement> busNames = driver.findElementsByXPath("//div[@class='service-name']");
		for(WebElement busName:busNames)
		{
			System.out.println(busName.getText());
		}
		List<WebElement> busPrices = driver.findElementsByXPath("//div[@class='fare']");
		List<Double> busprices=new ArrayList<>();
		for(WebElement busPrice:busPrices)
		{
			
			busprices.add(Double.parseDouble(busPrice.getText().replaceAll("INR ", "")));
				
		}
		Collections.sort(busprices);
		System.out.println(busprices.get(0));
		
		
		
	
	}

}
