package myownpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_distinct.asp");
		driver.findElementByLinkText("Try it Yourself »").click();
		//getWindowhandles will provide the list of windows unique ID's that are opened by the browser in the current session
		
		Set<String> uniwindows=driver.getWindowHandles();
		for(String uniWindow:uniwindows) {
			System.out.println(uniWindow);
		}
		List<String> windows=new ArrayList<>();
		windows.addAll(uniwindows);
		System.out.println(windows.size());
		/*o/p:CDwindow-C21D3F731A5A96233D0D414187B52EE7
		CDwindow-318817EC57E58F94F7052993A3CD4256
		2*/
		driver.switchTo().window(windows.get(1));
		driver.findElementByXPath("//button[text()='Run SQL »']").click();
		driver.switchTo().window(windows.get(0));
		driver.findElementByLinkText("Try it Yourself »").click();
		//whereas getWindowHandle will return the string that currently selenium webdriver is interacting with
		//System.out.println(driver.getWindowHandle());o/p:CDwindow-6BB4DCBABCF5F2317F1362040916674F
		//so in order to get the new window that opened in the current session we again take the list of windows unique ID's 
		//opened by the driver and the newly opened one will be the last one in the list.
		Set<String> uniqueWindows=driver.getWindowHandles();
		for(String uniqueWindow:uniqueWindows)
		{
			System.out.println(uniqueWindow);
		}
		List<String> windows1=new ArrayList<>();
		windows1.addAll(uniqueWindows);
		System.out.println(windows1.size());
		/*o/p:CDwindow-C21D3F731A5A96233D0D414187B52EE7
		CDwindow-318817EC57E58F94F7052993A3CD4256
		CDwindow-CB1BE6A7A2E20D058912CCA3BE1C72B9
		3*/
		driver.switchTo().window(windows1.get(2));
		driver.findElementByXPath("//button[text()='Run SQL »']").click();
		//In merge leads when we click on icon it goes to another window and when we click on first resulting lead in the new window the window will be closed 
		//and the old window appears even old window appears here the selenium interaction is with new window only so in order to interact with old window
		//we have to switch to old window.
		
		
		
		
		
		
	}

}
