package shgroup_testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import commonpackage.Base;
import commonpackage.Validations;
import pages.HomePage;
import pages.LoginPage;
import project_specific.Constants;

public class Login extends Base {
	@Test
public  void testLogin() throws IOException, InterruptedException
{
FileInputStream fis=new FileInputStream(Constants.propFile); 
	
	System.out.println(fis);
	Properties prop=new Properties();
	prop.load(fis);
	LoginPage lp=new LoginPage();
	lp.validLogin(prop.getProperty("username"),prop.getProperty("password"));

	
	
//	Dimension dimensions = driver.manage().window().getSize();
//	Double screenHeightStart = dimensions.getHeight() * 0.5;
//	int scrollStart = screenHeightStart.intValue();	
//	Double screenHeightEnd = dimensions.getHeight() * 0.3;
//	int scrollEnd = screenHeightEnd.intValue();
////	driver.swipe(scrollStart,scrollEnd,scrollStart+50,scrollEnd+50,2000);
	HomePage h=new HomePage();
	try {
		if(h.home.isDisplayed())
		{
			System.out.println("Successfull login");
		}
		else if(lp.loginButton.isDisplayed())
		{
			System.out.println("unSuccessfull login");
		}
	}
	catch(Exception e)
	{
		
	}
}
}
