package script;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.ImportData;
import page.LoginPage;
import page.ManageClaimPage;
import generic.Excel_Data;

public class Insurance_Upload_Test extends BaseTest
{
	@BeforeMethod
	public void Login() throws InterruptedException 
	{
	 String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",7,0);
	 String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",7,1);
	 LoginPage L1=new LoginPage(driver);
	    
		L1.setuserName(un);
		
		L1.setPassword(pw);
		Thread.sleep(2000);
		L1.clickLogin();
		Thread.sleep(2000);
	}
  @Test(priority=12,groups={"Data_Upload"})
  public void Insurance_Upload() throws InterruptedException, AWTException 
  {
	  DashboardPage DP1=new DashboardPage(driver);
	  DP1.clickImport();
	  ImportData ID1=new ImportData(driver);
	  ID1.Upload_RF();
	  
  }
}
