package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCARTpage {

	// Properties
	public WebDriver driver;

	// Locators - logo, AddCart,cartIcon

	@FindBy(xpath = "//*[text() ='Remove']")
	public WebElement Remove;

	public YourCARTpage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void RemoveDisplay() {
		Remove.isDisplayed();
	}

}
