package shgroup_testCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import commonpackage.Base;
import commonpackage.Validations;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import project_specific.Constants;

public class SignUp extends Base{
@Test
public void testSignUp() throws IOException, InterruptedException
{
	FileInputStream fis=new FileInputStream(Constants.propFile); 
	
	
	Properties prop=new Properties();
	prop.load(fis);
LoginPage lp=new LoginPage();
lp.signupLog();

SignUpPage sp=new SignUpPage();
sp.validSignUp(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("mobilenumber"), prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("address"));
HomePage h=new HomePage();
try {
	if(h.home.isDisplayed())
	{
		System.out.println("Sign up Successfull");
	}}
catch(Exception e)
{	System.out.println("Sign up Unsuccessfull");
}	

}
}
