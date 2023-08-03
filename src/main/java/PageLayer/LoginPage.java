package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass{
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunctionality(String uname,String pass) {
		
		UtilsClass.sendKeys(username, uname);
		UtilsClass.sendKeys(password, pass);
		}
	
	public void clickonloginbutton()
	{
		UtilsClass.click(loginbutton);
	}
}
