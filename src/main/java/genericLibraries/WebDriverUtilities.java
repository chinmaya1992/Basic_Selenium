package genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//generic method for mouseover
	public void mouseovering(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//generic method for right click
		public void rightClick(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
	}
		
	//generic method for double click
		public void doubleClick(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
	}
		
	//generic method for drag and drop
		public void dragAndDrop(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
	}	
	
		
	//generic method for dropdown
		public void dropDown(WebElement ele,String value) {
			Select s = new Select(ele);
			s.selectByVisibleText(value);
	}	
		
		//generic method for implicit wait
				public void implicitWait(WebDriver driver,int time) {
					driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
					
				}	
	
	//Generic method to handle frame
	public void frame(WebDriver driver,String ele) {
		driver.switchTo().frame(ele);	
		}
	
	//generic method to shift control back to normal web page
	public void frame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	//generic method for alter popup
		public void alterPopupAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		//generic method for alter popup
		public void alterPopupDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		//generic method for parent window
		public void parentWindow(WebDriver driver) {
			driver.getWindowHandle();
		}
		
		//generic method for child window
				public void childWindow(WebDriver driver) {
					driver.getWindowHandles();
				}
}
