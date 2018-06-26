package pages;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonpackage.Base;
import io.appium.java_client.TouchAction;


public class LoginPage  {
@FindBy(id="shgroup.tvisha.com.shgroup:id/et_userName")
WebElement userName;
@FindBy(id="shgroup.tvisha.com.shgroup:id/et_passWord")
WebElement passWord;
@FindBy(xpath="//android.widget.TextView[@text='Login']")
public WebElement loginButton;
@FindBy(xpath="//android.widget.TextView[@text='Guest Login']")
WebElement guestLoginButton;
@FindBy(xpath="//android.widget.TextView[@text='Forgot Password?']")
WebElement forgotPassword;
@FindBy(xpath="//android.widget.TextView[@text='Sign Up']")
WebElement signUp;

public LoginPage()
{
	PageFactory.initElements(Base.andriver,this);

}
public void signupLog()
{
	signUp.click();
}
public void validLogin(String un,String pwd) throws InterruptedException
{	
	userName.clear();
	userName.sendKeys(un);
	passWord.clear();
	passWord.sendKeys(pwd);
	loginButton.click();

	
	
}

}
