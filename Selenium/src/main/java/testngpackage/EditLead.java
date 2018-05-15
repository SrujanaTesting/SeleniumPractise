package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Scanner;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditLead extends ProjectMethods {
	@Test(dependsOnMethods = {"seleniumweek2day1classwork.CreateLeads.createLeads"})//(groups= {"smoke"})
	public void editLead() {
	
	click(locateElement("link","Leads"));
	click(locateElement("link","Find Leads"));
	type(locateElement("xpath","//label[text()='Lead ID:']/following::input[2]"),"a");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
	click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	System.out.println(verifyTitle("View Lead | opentaps CRM"));
	click(locateElement("link","Edit"));
	locateElement("id","updateLeadForm_companyName").clear();
	String compName;
	System.out.println("enter new ompany name");
	Scanner scan=new Scanner(System.in);
	compName=scan.next();
	type(locateElement("id","updateLeadForm_companyName"),compName);
	click(locateElement("xpath","//input[@value='Update']"));
	verifyExactText(locateElement("id","viewLead_companyName_sp"),compName);








	}
}
