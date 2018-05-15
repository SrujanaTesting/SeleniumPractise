package myownpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerElementVerifications {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/cssref/tryit.asp?filename=trycss_visibility");
		WebElement ele=driver.findElementByXPath("//h2[@class='a']");
		System.out.println(ele.isDisplayed());*/
		for(int i=0;i<5;i++)
		{
		usingMathClass();
		}
	}
 
	static void usingMathClass() {
		double randomDouble = Math.random();
		randomDouble = randomDouble * 50 + 1;
		int randomInt = (int) randomDouble;
		System.out.println(randomInt);
	}
		
		
		
	}


