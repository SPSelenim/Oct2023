package stctest.sepv2357;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest3 extends MyLib {
  @Test
  public void f() throws IOException {
  System.out.println("S T A R T E D **3****************");
  Init();
   driver.manage().window().maximize();
  String a=driver.findElement(By.xpath("//a[@name='Mylink']")).getAttribute("href");
  System.out.println("Get Attribute for href : " + a);
  String myLink=driver.findElement(By.xpath("//b[contains(text(),'Hello')]")).getText();
 System.out.println("******My Link ********"+myLink);
  driver.quit();
  }
}
