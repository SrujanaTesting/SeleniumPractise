package testngpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver =null;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("The "+browser+" browser launched successfully");
		takeSnap();
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		switch (locator) {
		case "id":
			ele = driver.findElementById(locValue);
			break;
		case "class":
			ele = driver.findElementByClassName(locValue);
			break;
		case "link":
			ele = driver.findElementByLinkText(locValue);
			break;
		case "xpath":
			ele = driver.findElementByXPath(locValue);
		break;
		case "name":
			ele=driver.findElementByName(locValue);
			break;
		case "cssvalue":
			ele=driver.findElementByCssSelector(locValue);
			break;
		case "partiallinktext":
			ele=driver.findElementByPartialLinkText(locValue);
			break;
		case "tag":
			ele=driver.findElementByTagName(locValue);
			break;
		default:System.out.println("none of the selector has given as input");
		
		}
		return ele;
		
	}

	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The given value is entered "+data);
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
		takeSnap();
	}
	
	public void clickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
		
	}


	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return ele.getText();
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("drop down is selected using text");
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByIndex(index);
		System.out.println("drop down is selected using index");
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		if(driver.getTitle().equals(expectedTitle))
			return true;
		else
			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().equals(expectedText))
			System.out.println("text is verified");
		else if(ele.getText().contains(expectedText))
			System.out.println("text is verified");
		else
			System.out.println("text is not verified");
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText))
			System.out.println("text is verified");
		else
			System.out.println("text is not verified");

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).equals(value))
			System.out.println("Attribute is verified");
		else
			System.out.println("Attribute is not verified");
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).contains(value))
			System.out.println("Attribute is verified");
		else
			System.out.println("Attribute is not verified");
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isSelected())
			System.out.println("check box or radio button is selected");
		else
			System.out.println("check box or radio button is not selected");
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isDisplayed())
			System.out.println("check box or radio button is selected");
		else
			System.out.println("check box or radio button is not selected");

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allWin= new ArrayList<String>();
		allWin.addAll(allWindows);
		driver.switchTo().window(allWin.get(index));
		System.out.println("switching to another window is done");
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
		System.out.println("switching to the frame is done");
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
	driver.switchTo().alert().accept();
	System.out.println("alert is accepted");
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		System.out.println("alert is dismissed");
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		return driver.switchTo().alert().getText();
		
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("browser is closed");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("all browsers are closed");
	}

}