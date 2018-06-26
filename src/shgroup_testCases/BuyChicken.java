package shgroup_testCases;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonpackage.Base;
import pages.HomePage;

public class BuyChicken extends Base {
	@Test
	public void testBuyChickenItem() throws IOException, InterruptedException
	{
	Login l=new Login();
	l.testLogin();
	
	HomePage hp=new HomePage();
	String chickenItemText=hp.buyChicken();
	System.out.println(chickenItemText);
	try {
	andriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+chickenItemText+"\").instance(0))");
	System.out.println("Offered product "+chickenItemText+" is successfully added to cart");
	}
	catch(Exception e)
	{
		System.out.println("Offered product is not added to cart");
	}
}
}
