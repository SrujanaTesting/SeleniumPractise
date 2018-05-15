package myownpackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectMultipleOption {

	private LearnSelectMultipleOption()
	{
		System.out.println("srujana");
	}
	public static void main(String[] args) throws InterruptedException {
		LearnSelectMultipleOption s=new LearnSelectMultipleOption();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Select select=new Select(driver.findElementByXPath("(//select)[6]"));
		System.out.println(select.isMultiple());
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.deselectByIndex(4);
		/*select.deselectByIndex(3);
		Thread.sleep(3000);
		select.deselectByValue("2");
		Thread.sleep(3000);
		select.deselectByVisibleText("Selenium");
		Thread.sleep(3000);*/
		//select.deselectAll();//it deselects all the options in the dropdown in the order it selected earlier 
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();//getSelectedOptions will provide what are all the options currently selected.
		for(WebElement allSelectedOption:allSelectedOptions)
		{
			System.out.println(allSelectedOption.getText());
		}
		List<WebElement> options=select.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
	}

}
