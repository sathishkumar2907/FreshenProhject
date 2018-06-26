package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonpackage.Base;
import io.appium.java_client.TouchAction;

public class HomePage {
@FindBy(xpath="//android.widget.TextView[@text='Home']")
public WebElement home;
@FindBy(xpath="//android.widget.TextView[@text='Chicken']")
WebElement chickenTab;
@FindBy(xpath="//android.widget.TextView[@text='Eggs']")
WebElement eggsTab;
@FindBy(xpath="//android.widget.TextView[@text='Offers']")
WebElement offersTab;
//@FindBy(xpath="//android.support.v7.widget.RecyclerView[@index='1']//android.widget.TextView[@index='1']")
@FindBy(id="shgroup.tvisha.com.shgroup:id/tv_trending_title")
public WebElement Item;
@FindBy(xpath="//android.widget.TextView[@text='Add to Cart']")
WebElement addToCart;
@FindBy(xpath="//android.widget.TextView[@text='Go to Cart']")
WebElement goToCart;
@FindBy(id="com.tvisha.freshen:id/action_drawer")
WebElement menuCurtain;
public HomePage()
{
	PageFactory.initElements(Base.andriver,this);
}
public String buyTrendingItem() throws InterruptedException
{
	Thread.sleep(3000);
	Base.scroll();
	String data=Item.getText();
	Item.click();
	try {
	addToCart.click();
	}
	catch(Exception e)
	{
		
	}
	goToCart.click();
	return data;
}
public String buyOfferedItem() throws InterruptedException
{
	offersTab.click();
	Thread.sleep(3000);
	Base.scroll();
	String data=Item.getText();
	Item.click();
	
	try {
	addToCart.click();
	}
	catch(Exception e)
	{
		
	}
	
	goToCart.click();
	return data;
}
public String buyChicken() throws InterruptedException
{
	chickenTab.click();
	Thread.sleep(3000);
	Base.scroll();
	String data=Item.getText();
	Item.click();
	Thread.sleep(1000);
	try {
	addToCart.click();
	}
	catch(Exception e)
	{
		
	}
	
	goToCart.click();
	return data;
}
public String buyEggs() throws InterruptedException
{
	eggsTab.click();
	Thread.sleep(3000);
	Base.scroll();
	
	String data=Item.getText();
	Item.click();
	
	try {
	addToCart.click();
	}
	catch(Exception e)
	{
		
	}
	
	goToCart.click();
	return data;
}
public void clickMenuCurtain()
{
	menuCurtain.click();
	
}
}
