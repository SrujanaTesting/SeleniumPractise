package myownpackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
//The above exception occurs when we are trying to locating the elements which are not of <select> tag in the DOM.
public class LearnSelectSingleOption {

	public static void main(String[] args) {
		//LearnSelectMultipleOption ss=new LearnSelectMultipleOption();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		Select dd=new Select(driver.findElementById("userRegistrationForm:securityQ"));
		dd.selectByIndex(8);//index starts from "0" in JAVA.
		dd.selectByValue("0");//for select tag we have child tags as option and options tags have "value" attribute and the value of this attribute should be given for this statement.
		dd.selectByVisibleText("Who was your Childhood hero?");//the text inside the option tag is given here
		//the above three statements can be executed first selectByIndex is executed after that selectByValue is executed and after selectByVisisbleText is executed.So finally childhodd hero is selected.
		System.out.println(dd.isMultiple());//This tells whether the SELECT element support multiple selecting options at the same time or not. This accepts nothing but returns boolean value(true/false).
		System.out.println(dd.getFirstSelectedOption().getText());//This will retrieve the label text of the current selected list option.
		List<WebElement> options=dd.getOptions();//gives the list of WebElements in the dropdown
		System.out.println(options.get(0).getText());//gives the text of first element.
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		System.out.println(options.size());
		
		
	}

}
