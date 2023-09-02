package stctest.sepv2357;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public WebDriver driver=null;
public Properties p=null;
public FileInputStream fis=null;	
public File f=null;
public String strChromePath="D:\\Satish\\05DemoApps\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe";	

public void Init() throws IOException
{
		// WebDriverManager.firefoxdriver().setup();
		  //driver=new FirefoxDriver();
		 
	System.setProperty("webdriver.chrome.driver", strChromePath);
	driver=new ChromeDriver();
	driver.get("D:\\Satish\\05DemoApps\\demo.html");
	f=new File("D:\\Satish\\03Eclipse_Workspace\\wsSeptember2023v1\\sepv2357\\src\\main\\java\\stctest\\sepv2357\\myFile.properties");
		  fis=new FileInputStream(f);
	 p=new Properties();
		  p.load(fis);
	}
}
