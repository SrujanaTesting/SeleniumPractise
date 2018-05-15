package myownpackage;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		WebElement findElementByClassName = driver.findElementByClassName("desktop-searchBar");
				//.isDisplayed());//sendKeys("sunglasses",Keys.ENTER);
		System.out.println(driver.findElementByXPath("//div[@class='desktop-logoContainer']/a"));
		
		/*List<WebElement> brands = driver.findElementsByClassName("product-brand");
		Set<String> uniqueBrands=new TreeSet<>();
		for(WebElement brand:brands)
		{
			uniqueBrands.add(brand.getText());
		}
		System.out.println(uniqueBrands);
		List<WebElement> disUnielemnts = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");
		int count=0;
		for(WebElement disUnielemnt:disUnielemnts)
		{
			if(disUnielemnt.getText().contains("(40% OFF)")&& disUnielemnt.getText().contains("Unisex") ) 
				count++;
					
			
		}
		System.out.println(count);
		
			driver.findElementByXPath("//li[@data-colorhex='green']/label[@class='colour-label']").click();
			Thread.sleep(4000);
			driver.findElementByXPath("(//img[@class='product-thumb'])[2]").click();
			String productName = driver.findElementByClassName("pdp-title").getText();
			String price = driver.findElementByClassName("pdp-price").getText();
			System.out.println(productName+"  "+price);
			driver.findElementByXPath("//button/span[text()='ADD TO BAG']").click();
			driver.findElementByXPath("//span[text()='GO TO BAG']/ancestor::a").click();
			System.out.println(driver.findElementByPartialLinkText("Ray-Ban Men Aviator Sunglasses").getText().contains(productName));
			String text = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();
			text=text.replaceAll(",", "");
			System.out.println(text.contains(price));
		*/
	}

}