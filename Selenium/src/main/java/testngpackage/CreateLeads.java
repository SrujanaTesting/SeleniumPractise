package testngpackage;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CreateLeads extends ProjectMethods {
	@Test//(dataProvider="getData")
	public void createLeads()
	{
		click(locateElement("link","Leads"));
		click(locateElement("link","Create Lead"));
		type(locateElement("id","createLeadForm_companyName"),"TCS");
		type(locateElement("id","createLeadForm_firstName"),"srujana");
		type(locateElement("id","createLeadForm_lastName"),"thrinadh");
		click(locateElement("xpath","//input [@type ='submit']"));

	}
	

}
