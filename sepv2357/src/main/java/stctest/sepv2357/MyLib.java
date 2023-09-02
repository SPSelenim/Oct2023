package stctest.sepv2357;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyLib extends BaseClass {

	public WebElement getElemenetByID(String ID)
	{
		
		WebElement myElement=driver.findElement(By.id(p.getProperty(ID)));
		return myElement;
	}
	
	public WebElement getElemenetByXpath(String xID)
	{
		WebElement myElementx=driver.findElement(By.xpath(p.getProperty(xID)));
		return myElementx;
	}
}
