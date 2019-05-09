package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;

public class ValidLogin_Test extends BaseTest
{
@Test(priority=1,groups={"login","smoke"})
//@Test(priority=1,groups={"login","smoke"})
public void validLogintest() throws InterruptedException
{
	String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,0);
	String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
	String HomeTitle= "GrameenKoota";
	LoginPage L1=new LoginPage(driver);
	L1.setuserName(un);
	L1.setPassword(pw);
	L1.clickLogin();
	//To check the Home page title
	Thread.sleep(2000);
	L1.verifyTitle(driver,HomeTitle);
	Thread.sleep(1000);
	DashboardPage L2=new DashboardPage(driver);
	L2.clickLogout();	
}
}
