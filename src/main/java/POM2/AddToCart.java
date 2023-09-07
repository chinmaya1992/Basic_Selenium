package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	//Declaration
	//Address of plus button
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusBtn;
	
	//Address of addtocart button
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement atcBtn;
	
	//Initialization
		public AddToCart(WebDriver driver) {
			PageFactory.initElements(driver, this);	
			}
		
		//Utlization
	    public void plusBtn() {
	    	getPlusBtn().click();
	    }
	    
	    public void atcBtn() {
	    	atcBtn.click();
	    }
	    
	  //getter method

		public WebElement getPlusBtn() {
			return plusBtn;
		}

		public void setPlusBtn(WebElement plusBtn) {
			this.plusBtn = plusBtn;
		}
	    
	    
	    

}
