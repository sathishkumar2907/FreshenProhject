package commonpackage;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Validations {
public static void verifyByElement(WebElement e)
{
	if(e.isDisplayed())
	{
		Reporter.log("success");
		System.out.println("success");
	}
	else{
		Reporter.log("fail");
		System.out.println("fail");
	}
}
}
