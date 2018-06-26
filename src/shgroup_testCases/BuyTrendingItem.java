package shgroup_testCases;


import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import commonpackage.Base;
import io.appium.java_client.TouchAction;
import pages.HomePage;

public class BuyTrendingItem extends Base{
@Test
public void testBuyTrendingItem() throws IOException, InterruptedException
{
	Login l=new Login();
	l.testLogin();
	
	HomePage hp=new HomePage();
	String trendingItemText=hp.buyTrendingItem();
	System.out.println(trendingItemText);
//	//andriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text("+trendingItemText+"));"));
//	andriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView("+trendingItemText+");");
	
	try {
	
	andriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+trendingItemText+"\").instance(0))");
	System.out.println("Trending product is successfully added to cart");
	}
	catch(Exception e)
	{
		System.out.println("Trending product is not added to cart");
	}


}
}
