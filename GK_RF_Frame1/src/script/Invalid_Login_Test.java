package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.LoginPage;

public class Invalid_Login_Test extends BaseTest
{

	@Test(priority=2,groups={"login"})
	public void testinvalidLogin() throws InterruptedException 
	{
		int rc=Excel_Data.getRowCount(EXCEL_PATH,"Invalid Login");

		/*1)user ID and Password blank.
	  2)User ID valid Pwd blank
	  3)user ID Blank and Pwd valid*/
		LoginPage L1=new LoginPage(driver);
		for(int i=1;i<=rc;i++)
		{
			String un=Excel_Data.getValue(EXCEL_PATH, "Invalid Login",i,0);
			String pw=Excel_Data.getValue(EXCEL_PATH, "Invalid Login",i,1);
			L1.setuserName(un);
			L1.setPassword(pw);
			L1.clickLogin();
			Thread.sleep(2000);
			L1.clearusername(un);
			L1.clearpassword(pw);
			//Reporter.log(i+"loop",true);
		}



	}
}
