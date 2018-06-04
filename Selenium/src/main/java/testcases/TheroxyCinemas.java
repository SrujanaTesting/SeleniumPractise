package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Duration;

public class TheroxyCinemas {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srujana\\git\\pushing\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.get("https://www.theroxycinemas.com/movie-details/deadpool-2/");
		driver.get("https://www.theroxycinemas.com/");
		
		Actions builder=new Actions(driver);
		WebElement deadpool = driver.findElementByXPath("//section[@onclick[contains(.,'deadpool')]]//img[@class='img-responsive']");////section[@onclick[contains(.,'deadpool')]]
		builder.moveToElement(deadpool).pause(2000).click(deadpool).build().perform();
		System.out.println(driver.findElementByXPath("(//section[@class='cinema-exp']/h3)[1]").getText());
		System.out.println(driver.findElementByXPath("(//section[@class='cinema-exp']/h3)[2]").getText());
		WebElement showtime = driver.findElementByXPath("//span[@class='mshowtime']/..");
		builder.moveToElement(showtime).pause(2000).click(showtime).build().perform();
		WebElement skip = driver.findElementByXPath("//a[text()[contains(.,'SKIP & PROCEED')]]");
		builder.moveToElement(skip).pause(2000).click(skip).build().perform();
		List<WebElement> seats = driver.findElementsByXPath("//li[text()='G']/following-sibling::li[@class='rc-availableseat']/a");
		for(int i=0;i<2;i++)
		{
			builder.moveToElement(seats.get(i)).pause(2000).click(seats.get(i)).build().perform();
		}
		WebElement next = driver.findElementByXPath("//a[text()[contains(.,'NEXT')]]");
		builder.moveToElement(next).pause(2000).click(next).build().perform();
		if(Integer.parseInt(driver.findElementByXPath("//span[@class='tket-count']/b").getText())==2)
			System.out.println(driver.findElementByXPath("//span[@class='tket-count']/b").getText()+" tickets are selected");
		else
			System.out.println(driver.findElementByXPath("//span[@class='tket-count']/b").getText()+" are not selected");
		//driver.findElementByXPath("//a[text()[contains(.,' Proceed as Guest')]]").click();

		

		
	}

}