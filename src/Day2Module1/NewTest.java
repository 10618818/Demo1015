package Day2Module1;

import org.testng.annotations.Test;

//public class NewTest {
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

public class NewTest {

		public static void main(String[] args) {
	        System.setProperty("webdriver.gecko.driver","C:\\LKM\\Cucumber\\Drivers\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demoaut.com/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.linkText("REGISTER")).click();
			driver.navigate().refresh();
			driver.navigate().back();
			driver.navigate().forward();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
			
			  //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
//				  Select ddCountry = new Select(driver.findElement(By.name("country")));
//		 	     ddCountry.selectByVisibleText("ARGENTINA");
			
		 	     
//			driver.findElement(By.name("userName")).sendKeys("mercury");
//			driver.findElement(By.name("password")).sendKeys("mercury");
//			//driver.findElement(By.name("password")).clear();
//			driver.findElement(By.name("login")).click();
//			driver.close();

		}

	}


