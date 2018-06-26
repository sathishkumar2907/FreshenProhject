package shgroup_testCases;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import commonpackage.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SignUp_Multiple extends Base{
	@Test(dataProvider="usersignup")
	public void test12(String fn,String ln,String mn) throws InterruptedException, IOException
	{
//		LoginPage lp=PageFactory.initElements(Base.andriver, LoginPage.class);
//		lp.validLogin(un, pwd);
		andriver.findElementByXPath("//android.widget.TextView[@text='Sign Up']").click();
		andriver.findElementByXPath("//android.widget.EditText[@text='First Name']").sendKeys(fn);
		andriver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys(ln);
		andriver.findElementByXPath("//android.widget.EditText[@text='Mobile Number']").sendKeys(mn);
		andriver.findElementByXPath("//android.widget.TextView[@text='Sign Up']").click();
	}
	@DataProvider(name="usersignup")
	public Object[][] loginData() throws BiffException, IOException 
	{
		Object[][] arrayObject = getExcelData("/home/sanketh/Documents/eclipse workspace/Appium/shgroup/files/data.xls","Sheet1");
		return arrayObject;
	}
	public String[][] getExcelData(String fileName, String sheetName) throws BiffException, IOException
	{
		String[][] arrayExcelData = null;
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);
			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {
				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				
				}
				}
			return arrayExcelData;

	}
}
