package stctest.sepv2357;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//New Test 2 Parth
//New SP
//02-09-2023 pa
//03-09-2023
//14 - 1

public class NewTest2 extends MyLib{
//03-09-2023 
	@Test
  public void f() throws InterruptedException, IOException {
  System.out.println("S T A R T E D *****2*************");
  try
  {
  Init();
  driver.manage().window().maximize();
  getElemenetByID("first").sendKeys("HelloFirstName");
  getElemenetByID("last").sendKeys("HelloLastName");
  
    Thread.sleep(5000);
  }
  catch(Exception e)
  {
	  System.out.println("OOOOO");
    
  System.out.println(e.getMessage());
  }
  finally
  {
	System.out.println("Quitinnnng    ggggg");
	  driver.quit();
  }
  }
}
