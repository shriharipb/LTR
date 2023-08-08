package ecar;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Maruti {
  @Test
  public void MarutiTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening MarutiSuzuki", true );
	  driver.get("https://www.marutisuzuki.com/");
	 
	  Thread.sleep(4000);
	  driver.close();
  }
  }
