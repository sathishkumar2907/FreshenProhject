package shgroup_testCases;

import java.io.IOException;

import commonpackage.Base;
import pages.HomePage;
import pages.MenuCuratainPage;
import pages.MyProfilePage;

public class Profile extends Base
{
	public void testProfile() throws IOException, InterruptedException
	{
	Login l=new Login();
	l.testLogin();
	HomePage hp=new HomePage();
	hp.clickMenuCurtain();
	MenuCuratainPage mcp=new MenuCuratainPage();
	mcp.clickProfileName();
	MyProfilePage mpp=new MyProfilePage();
	mpp.editProfile();
	
	}
}