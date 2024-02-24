package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By txt_username= By.xpath("//div[@class='text-field-content']//div[@class='input-item-content']//input[@class='text-field__input inputClassObj']");
	By txt_password= By.xpath("//div[@class='password-field-content']//div[@class='input-item-content']/input[@class='text-field__input inputClassObj']");
	By btn_login= By.xpath("//div[@class='button-and-link button-and-link button-and-link-otp']/button");
	By lbl_logo= By.xpath("//div[@class='lsco-row lsco-row-xs--middle']");
	
public loginPage(WebDriver driver)
{
	this.driver=driver;
}

	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	public void isLogoDisplayed()
	{
		driver.findElement(lbl_logo).isDisplayed();
	}


	public void userLogin(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}


 
}
