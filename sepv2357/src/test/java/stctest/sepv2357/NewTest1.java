package stctest.sepv2357;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  @Test
  public void f() {
  System.out.println("S T A R T E D");
  WebDriverManager.firefoxdriver().setup();
  WebDriver driver=new FirefoxDriver();
  driver.get("D:\\Satish\\05DemoApps\\demo.html");
  driver.manage().window().maximize();
  String a=driver.findElement(By.xpath("//a[@name='Mylink']")).getAttribute("href");
  System.out.println("Get Attribute for href : " + a);
 driver.quit();
  }
}
