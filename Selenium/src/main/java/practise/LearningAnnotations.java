package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearningAnnotations {
	
	
 // @Test(invocationCount=2,threadPoolSize=2)
  public void f() {
	  System.out.println("Iam @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Iam @BeforeMethod");
	  

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Iam @AfterMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Iam @BeforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam @AfterClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam @BeforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam @AfterTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam @BeforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam @AfterSuite");

  }

}
