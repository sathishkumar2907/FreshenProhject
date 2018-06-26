package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonpackage.Base;

public class Order {
	@Test
public void testOrder()
{
		Base.browser();
		WebDriver driver =Base.driver;
		driver.findElement(By.xpath("//span[text()=' Orders ']")).click();
		
}
}
