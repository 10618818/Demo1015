package Day1Module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class NewTest {
	WebDriver driver;
	public void browserTest() {
		driver.get("https://www.google.com/");
		//driver.navigate().to("https//google.com");
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","\\\\\\C:\\Users\\A08019DIRP_C2C.04.02\\Desktop\\chromedriver.exe");
	  driver = new ChromeDriver();
  
  
	driver.manage().window().maximize();	
  }
	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
