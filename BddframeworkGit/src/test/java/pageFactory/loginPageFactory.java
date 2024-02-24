package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	WebDriver driver;
	@FindBy(xpath="//div[@class='text-field-content']//div[@class='input-item-content']//input[@class='text-field__input inputClassObj']")
	WebElement txt_username;
	@FindBy(xpath="//div[@class='password-field-content']//div[@class='input-item-content']/input[@class='text-field__input inputClassObj']")
	WebElement txt_password;
	@FindBy (xpath="//div[@class='button-and-link button-and-link button-and-link-otp']/button")
	WebElement btn_login;
	
	public void enterUsername(String username)
	{
	    (txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		(txt_password).sendKeys(password);
	}
	public void clickLogin()
	{
		(btn_login).click();
	}
	public loginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
