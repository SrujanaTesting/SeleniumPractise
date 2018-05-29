import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srujana\\git\\pushing\\Selenium\\drivers\\chromedriver.exe");
		/*ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
*/		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
