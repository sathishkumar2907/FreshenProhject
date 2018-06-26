package pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonpackage.Base;
import io.appium.java_client.android.AndroidElement;

public class SignUpPage {
	@FindBy(xpath="//android.widget.TextView[@text='Accept']")
	WebElement accept;
	@FindBy(id="com.tvisha.freshen:id/iv_profile_pic_edit")
	WebElement uploadYourPhoto;
	@FindBy(xpath="//android.widget.TextView[@text='Photos']")
	WebElement gallery;
	@FindBy(xpath="//android.widget.Button[@text='Just once']")
	WebElement justOnce;
	@FindBy(xpath="//android.widget.ImageView[@index='0']")
	WebElement image;
	@FindBy(xpath="//android.widget.RelativeLayout[@index='1']")
	WebElement imageFolder;
	@FindBy(xpath="//android.widget.EditText[@text='First Name']")
	WebElement firstName;
	@FindBy(xpath="//android.widget.EditText[@text='Last Name']")
	WebElement lastName;
	@FindBy(xpath="//android.widget.EditText[@text='Mobile Number']")
	WebElement mobileNumber;
	@FindBy(xpath="//android.widget.EditText[@text='Email']")
	WebElement email;
	@FindBy(id="com.tvisha.freshen:id/et_passWord")
	WebElement password;
	@FindBy(xpath="//android.widget.EditText[@text='Address']")
	WebElement address;
	@FindBy(xpath="//android.widget.TextView[@text='Sign Up']")
	public WebElement signUp;
	public SignUpPage()
	{
		PageFactory.initElements(Base.andriver,this);
		
	}
	public void validSignUp(String fn,String ln,String mn,String em,String pwd,String adr ) throws InterruptedException
	{
		accept.click();
		uploadYourPhoto.click();
		try{
			gallery.click();
		}
		catch(Exception e)
		{
			
		}
		try {
			justOnce.click();
		}
		catch(Exception e)
		{}
		imageFolder.click();
		image.click();
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		mobileNumber.sendKeys(mn);
		email.sendKeys(em);
		password.sendKeys(pwd);
		address.sendKeys(adr);
		signUp.click();
	}
}
