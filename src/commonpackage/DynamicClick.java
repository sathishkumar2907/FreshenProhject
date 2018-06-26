package commonpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import pages.LoginPage;
import project_specific.Constants;

public class DynamicClick extends Base{
	@Test
	public void test() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream(Constants.propFile); 
		
		
		Properties prop=new Properties();
		prop.load(fis);
		LoginPage lp=new LoginPage();
		lp.validLogin(prop.getProperty("username"),prop.getProperty("password"));
		andriver.findElementById("shgroup.tvisha.com.shgroup:id/iv_cart").click();
		int n=1;
		while(n>0)
		{
//
//		List<WebElement> l=driver.findElementsByXPath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout");
//		int siz=l.size();
//		System.out.println(siz);
//		for(int i=0;i<=siz-1;i++)
//		{
//			
//		WebElement ele=driver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='"+i+"']//android.widget.TextView[@index='1']");
//		String data=ele.getText();
//		if(data.equals("asd"))
			{
//				ele.click();
//				break;
//			}
//		else {
////			WebElement screen=driver.findElementByClassName("android.support.v7.widget.RecyclerView");
//			int wid  = screen.getSize().width;
//			int hgt = screen.getSize().height;
//			System.out.println(wid);
//			System.out.println(hgt);
		    
//		   driver.swipe(0, 674,0, 245, 1000);
		}
		}
		}
		

		
		
		
		
		
		
		
////		WebElement contact = andriver.findElementByClassName("android.widget.ListView");
////		int wide  = contact.getSize().width;
////		int hgt = contact.getSize().height;
////		
////		int startx = (int) (wide * (0.8));
////		int endx = (int)(wide *(0.2));
////		int starty =  hgt /2 ;
////	    int endy = hgt/2;
////		//andriver.swipe(startx, starty, endx, endy, 1000);
//		String text="best eggs";
//		andriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
//		Thread.sleep(2000);
//		try{
//			andriver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='2']//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='2']//android.widget.ImageButton[@index='1']").click();
//			andriver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='2']//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='0']//android.widget.ImageView[@index='0']").click();
//			andriver.findElementById("android:id/button1").click();
//		}
//	catch(Exception e)
//		{
//		e.printStackTrace();
//		andriver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='2']//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='0']//android.widget.ImageView[@index='0']").click();
//	}
//	}

}

