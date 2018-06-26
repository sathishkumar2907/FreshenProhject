package shgroup_testCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import commonpackage.Base;
import pages.HomePage;

public class BuyOfferedItem extends Base {
	@Test
	public void testBuyOfferedItem() throws IOException, InterruptedException
	{
	Login l=new Login();
	l.testLogin();
	HomePage hp=new HomePage();
	String offeredItemText=hp.buyOfferedItem();
	System.out.println(offeredItemText);
	try {
	andriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+offeredItemText+"\").instance(0))");
	System.out.println("Offered product "+offeredItemText+" is successfully added to cart");
	}
	catch(Exception e)
	{
		System.out.println("Offered product is not added to cart");
	}
}
}