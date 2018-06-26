package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonpackage.Base;
import io.appium.java_client.TouchAction;
import pages.HomePage;
import shgroup_testCases.Login;

public class AddProduct {
	String productTitle="chicken65";
	
	@Test(priority=1)
public  void testDemo() throws InterruptedException
{
		
		System.setProperty("webdriver.chrome.driver","/home/sanketh/Downloads/chromedriver");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.2.64/sh_group_web/public/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).sendKeys("raghava.p@freshen.com");
		driver.findElement(By.id("password")).sendKeys("raghava1");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()=' products ']")).click();
		driver.findElement(By.xpath("//span[text()='Add product']")).click();
		Thread.sleep(1000);
		Select category=new Select(driver.findElement(By.id("category_select")));
		category.selectByIndex(1);
		Thread.sleep(1000);
		Select subCategory=new Select(driver.findElement(By.id("sub_category_select")));
		subCategory.selectByIndex(1);
		Thread.sleep(1000);
		Select store=new Select(driver.findElement(By.id("product_store")));
		store.selectByIndex(1);
		driver.findElement(By.id("product_title")).sendKeys(productTitle);
		driver.findElement(By.id("product_price")).sendKeys("200");
		driver.findElement(By.id("product_discount_price")).sendKeys("100");
		driver.findElement(By.id("product_gst")).sendKeys("100");
		driver.findElement(By.id("bulk_qty")).sendKeys("20");
		driver.findElement(By.id("productQuantityId")).sendKeys("10");
		Select quantType=new Select(driver.findElement(By.id("quantityType")));
		quantType.selectByIndex(2);
		driver.findElement(By.id("productFileUpload")).sendKeys("/home/sanketh/Pictures/images (11).jpeg");
		driver.findElement(By.id("product_description")).sendKeys("testing");
		driver.findElement(By.id("addProductId")).click();
		System.out.println(productTitle);
}
	@Test(priority=2)
	public void demo() throws IOException, InterruptedException
	{
		Base.capabilities();
		Login l=new Login();
		l.testLogin();
		Thread.sleep(3000);
		Base.scroll();
		HomePage hp=new HomePage();
		String item=hp.Item.getText();
		System.out.println(item);
		if(item.equals(productTitle))
		{
			System.out.println("product added successfully");
		}
	}
}