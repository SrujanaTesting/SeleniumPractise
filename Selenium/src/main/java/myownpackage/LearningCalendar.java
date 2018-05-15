package myownpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.in/CheapFlightsHome");
		driver.findElementById("rt_ui_picker").click();
		
		/*driver.findElementByXPath("//label[text()='Onward Date']").click();
		
		WebElement table=driver.findElementByXPath("//table[@class='rb-monthTable first last']");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
			List<WebElement> columns=rows.get(4).findElements(By.tagName("td"));
			columns.get(2).getText();
	*/
	}

}
