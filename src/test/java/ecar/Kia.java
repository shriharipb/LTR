package ecar;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kia {
  @Test
  public void KiaTest () throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Kia", true );
	  driver.get("https://www.kia.com/in/home.html");
	  //Assert.fail();
	  Thread.sleep(4000);
	  driver.close();
  }
}
