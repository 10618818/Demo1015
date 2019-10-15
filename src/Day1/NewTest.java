package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

public class NewTest {
	
  @Test(priority = 1)
  public void Login() {
	  System.out.println("Do a Login");
  }
  @Test(priority = 3)
  public void BalanceInq() {
	  System.out.println("Do a Balance Inquiry");
  }
  
  @Test(priority = 2, dataProvider = "Balance")
  public void TotBalance(int bal, int loan)
{
	 
	  int Total = bal - loan; 
	  System.out.println("Total Available balance: " + Total);
  }
  
 
  @Test(priority = 4)
  public void Logout() {
	  System.out.println("Do a Logout");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }
  
  @DataProvider
  public Object[][] Balance() {
      Object[][] data = {
     
    		  {100000,100},
    		
    };
  return data;
  }
}




