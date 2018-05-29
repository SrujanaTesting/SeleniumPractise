import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srujana\\git\\pushing\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
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
		/*Thread.sleep(5000);
		driver.getKeyboard().sendKeys(Keys.ENTER);;*/

		
		
		
	
	}

}
