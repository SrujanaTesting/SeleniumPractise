package myownpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	static ChromeDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.getScreenshotAs(OutputType.FILE);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		//0th Index frame-><iframe name="iframe1" id="IF1" height="600" width="400" src="http://toolqa.com>.....</iframe>
		//1st index frame-><iframe name="iframe2" id="IF2" height="600" width="400" src="http://toolqa.com>.....</iframe>
		driver.switchTo().parentFrame();//->if we have frame inside another frame to switch from sub frame to parent frame we use this methd
	}
	public static void switchFrameByIndex()
	{
		driver.findElementsByTagName("iframe");//->to know how many frames available in the webpage.
		driver.switchTo().frame(0);//->switch to 0th frame
		driver.switchTo().defaultContent();//->to come out of the frame 0.
		//driver.switchTo().frame(1);->switch to 1st Frame
		driver.close();
	}
	public static void switchFrameByName()
	{
		driver.switchTo().frame("iframe1");//->switch to  frame that has 'name' attribute with 'iframe1' as value
		driver.switchTo().defaultContent();//->to come out of the frame that has iframe1 value for name attribute.
		//driver.switchTo().frame("iframe2");->switch to  frame that has 'name' attribute with 'iframe2' as value
		driver.close();
	}
	public static void switchFrameById()
	{
		driver.switchTo().frame("IF1");//->switch to  frame that has 'id' attribute with 'IF1' as value
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("IF2");->switch to  frame that has 'id' attribute with 'IF2' as value
		driver.close();
	}
	public static void switchFrameByElement()
	{
		driver.switchTo().frame(driver.findElementById("IF1"));//->we are switching to frame by identifying the frame with the help of findElementMEthods
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(driver.findElementById("IF2"));
		driver.close();
	}
}
