package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemo {
	
	//Declaration
	//Address of course link
	@FindBy(id="course")
	private WebElement courseLink;
	
	//Address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTng;
	
	//Initialization
	public SkillraryDemo(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	//Utlization
    public void courseLink() {
    	courseLink.click();
    }
    
    public void seleniumTraining() {
    	seleniumTng.click();
    }
	
	

}
