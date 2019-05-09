package script;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.LoginPage;

public class Invalid_Login_Test1 extends BaseTest
{
	@Test(priority=3,groups={"login"})
	public void testinvalidLogin1() throws InterruptedException 
	  {
		  
		  String expalertMSG="Invalid Login Credentials";
		  LoginPage L1=new LoginPage(driver);
		  
		  int rc1=Excel_Data.getRowCount(EXCEL_PATH,"Invalid Login1");
		  
		  for(int i=1;i<=rc1;i++)
		  {
			  String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login1", i,0);
			  String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login1", i,1);
			  L1.setuserName(un);
			  L1.setPassword(pw);
			  L1.clickLogin();
			  Thread.sleep(1000);
			  L1.verifyErrorMSG(expalertMSG);
			  
			  L1.clickOKAlert();
			  
			  
		  }
	  }
	

}
