package shgroup_testCases;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonpackage.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_multiple extends Base {
	@Test(dataProvider="userlogin")
	public void test12(String un,String pwd) throws InterruptedException, IOException
	{
//		LoginPage lp=PageFactory.initElements(Base.andriver, LoginPage.class);
//		lp.validLogin(un, pwd);
		andriver.findElementById("shgroup.tvisha.com.shgroup:id/et_userName").sendKeys(un);
		andriver.findElementById("shgroup.tvisha.com.shgroup:id/et_passWord").sendKeys(pwd);
		andriver.findElementByXPath("//android.widget.TextView[@text='Login']").click();
	}
	@DataProvider(name="userlogin")
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
 