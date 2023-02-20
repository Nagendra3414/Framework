package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Properties
		public WebDriver driver;
		
		
		//Locators - logo, AddCart,cartIcon
		
		@FindBy(xpath = "//*[@class ='app_logo']")
		public WebElement logo;
		
		
		@FindBy(xpath = "(//*[text()='Add to cart'])[1]")
		public WebElement AddCart;
		
	
		@FindBy(xpath = "//*[@class ='shopping_cart_link']")
		public WebElement CartIcon;
		
		
		// Constructor method
		
		public HomePage(WebDriver driver)
		{
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		// methods - opearational methods
		public void logoDisplayed()
		{
			logo.isDisplayed();
		}
		
		
		public void AddCartItemClick()
		{
			AddCart.click();
		}
		
		public void CartIconClick()
		{
			CartIcon.click();
		}
}
