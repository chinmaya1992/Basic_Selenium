package POM;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fb_LoginPage {
	
	//Declaration
	//address of email textfield
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of email passwordfield
		@FindBy(id="pass")
		private WebElement passwordTf;
		
		//address of email Login button
		@FindBy(xpath="//button[@name='login']")
		private WebElement loginBtn;
		
		//initialization
		public Fb_LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//utlization
		public void emailTextField(String value) {
			emailTf.sendKeys(value);
		}
		public void passwordTextField(String value) {
			passwordTf.sendKeys(value);
		}
		public void loginButton() {
			loginBtn.click();
		}
		
		
	

}
