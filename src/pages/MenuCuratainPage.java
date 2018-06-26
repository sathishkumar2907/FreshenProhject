package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonpackage.Base;

public class MenuCuratainPage {
@FindBy(id="com.tvisha.freshen:id/nav_profile_name")
WebElement profileName;
public MenuCuratainPage()
{
	PageFactory.initElements(Base.andriver,this);
}
public void clickProfileName()
{
	profileName.click();
}
}
