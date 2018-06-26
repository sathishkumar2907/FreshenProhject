package commonpackage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<WebElement> andriver;
	@BeforeMethod
public static  void capabilities() throws MalformedURLException 
{
	File f=new File("src");
	File f1=new File(f,"freshen27.apk");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "6");
	cap.setCapability("unicodeKeyboard", true);
	cap.setCapability("resetKeyboard", true);
	cap.setCapability(MobileCapabilityType.APP, f1.getAbsolutePath());
	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	cap.setCapability("autoGrantPermissions", "true");
//	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
	andriver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	andriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
}
	public static void  scroll() throws InterruptedException
	{
		Thread.sleep(3000);
		Dimension dimensions = Base.andriver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.46;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction t = new TouchAction(Base.andriver);
		t.press(0, scrollStart).perform();
		t.moveTo(0,scrollEnd).release().perform();
	}
	public static WebDriver driver;
	public static void browser()
	{
		System.setProperty("webdriver.chrome.driver","/home/sanketh/Downloads/chromedriver");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.2.64/sh_group_web/public/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).sendKeys("raghava.p@freshen.com");
		driver.findElement(By.id("password")).sendKeys("raghava1");
		driver.findElement(By.id("loginBtn")).click();
		
	}
	
}