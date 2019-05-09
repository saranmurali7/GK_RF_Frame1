package script;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;
import page.ManageClaimPage;

public class Settlement_OPEX_SettledtoNominee_Test extends BaseTest
{
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,0);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
	    LoginPage L1=new LoginPage(driver);
			L1.setuserName(un);
			L1.setPassword(pw);
			L1.clickLogin();
			Thread.sleep(2000);
	}
  @Test(priority=13,groups={"Settlement_Management","smoke"})
  public void Settled_To_Nominee() throws InterruptedException, AWTException
  {
	  String MemID=Excel_Data.getValue(EXCEL_PATH,"Settlement Details", 1, 0);
	  DashboardPage DP1=new DashboardPage(driver);
	  DP1.ClickMenuOption();
	  Thread.sleep(2000);
	  ManageClaimPage MCP1=new ManageClaimPage(driver);
	  MCP1.SearchbyMem();
	  Thread.sleep(1000);
	  MCP1.EnterMemID(MemID);
	  Thread.sleep(2000);
	  MCP1.Clicksrch();
	  Thread.sleep(2000);
	  MCP1.Settle_Nominee();
  }
}
