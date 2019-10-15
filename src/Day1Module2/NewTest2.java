package Day1Module2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "Logindata")
  public void loginApp(String username, String logindata) {
	  System.out.println("User name:  "+ username +" login credentials: "+ logindata);
  }

  @DataProvider
  public Object[][] Logindata() {
      Object[][] data = {
     
    		  { "Priya", "abcd" },
    		  { "dharshini", "bcde" },
    };
  return data;
  }
}
