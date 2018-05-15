package myownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteractions {
	public static void main(String[] args) throws InterruptedException {
		
		 System.out.println(tryExample());
	/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
WebElement ele = driver.findElementByLinkText("Droppable");
	Actions bulider=new Actions(driver);
	bulider.contextClick(ele).build().perform();*/
	//Thread.sleep(3000);
	//bulider.dragAndDrop(driver.findElementById("draggable"), driver.findElementById("droppable")).build().perform();
}

	private static int tryExample() {
try {
	int i=9;
	return i;
}
catch(ArithmeticException e){
	return 5;
}
	}
}
 	