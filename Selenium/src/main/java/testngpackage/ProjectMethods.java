package testngpackage;

import java.io.IOException;

import org.testng.annotations.*;

//import testngweek.LearningExcelInteraction;

public class ProjectMethods extends SeMethods {
	//@Parameters({"url","password"})
	@BeforeMethod//(groups= {"All"})
	public void login(){
		startApp("chrome","http://leaftaps.com/opentaps/control/main");
		type(locateElement("id","username"),"DemoSalesManager");
		type(locateElement("id","password"),"crmsfa");
		click(locateElement("class","decorativeSubmit"));
		click(locateElement("link","CRM/SFA"));
		//click(locateElement("link","Leads"));
	}
	@AfterMethod//(groups= {"All"})
	public void closeapp()
	{
		closeBrowser();	
	}
	/*@DataProvider(name="getData")
	public Object[][] getData() throws IOException
	{
		LearningExcelInteraction lExcel=new LearningExcelInteraction();
		Object[][] data = lExcel.readExcel();
		


		return data;
		
	}*/
	
	

}