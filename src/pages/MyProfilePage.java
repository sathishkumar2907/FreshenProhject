package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonpackage.Base;

public class MyProfilePage {
@FindBy(id="com.tvisha.freshen:id/et_firstName")
WebElement firstName;
@FindBy(id="com.tvisha.freshen:id/et_lastName")
WebElement lastName;
@FindBy(id="com.tvisha.freshen:id/et_mobile")
WebElement mobileNumber;
@FindBy(id="com.tvisha.freshen:id/et_emai")
WebElement email;
@FindBy(id="com.tvisha.freshen:id/actv_user_address")
WebElement address;
@FindBy(id="com.tvisha.freshen:id/tv_submit")
WebElement submit;
public MyProfilePage()
{
	PageFactory.initElements(Base.andriver, this);
}
public void editProfile()
{
	firstName.sendKeys("abc");
	lastName.sendKeys("xyz");
	mobileNumber.sendKeys("9132313211");
	email.sendKeys("abcdefg@abc.com");
	address.sendKeys("kphb");
	submit.click();
}
}
