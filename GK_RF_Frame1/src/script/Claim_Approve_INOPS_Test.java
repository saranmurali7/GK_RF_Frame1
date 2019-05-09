package script;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;
import page.ManageClaimPage;

public class Claim_Approve_INOPS_Test extends BaseTest
{
@BeforeMethod
public void Login() throws InterruptedException 
{
 String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",3,0);
 String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",3,1);
 String pw1=pw.replaceFirst("\\.0+$", "");
 System.out.println("text"+pw1);
 LoginPage L1=new LoginPage(driver);
		    
				L1.setuserName(un);
				
				L1.setPassword(pw1);
				Thread.sleep(2000);
				L1.clickLogin();
				Thread.sleep(2000);
}
  @Test(priority=6,groups={"Claim_Management","smoke"})
  public void Claim_Approve() throws InterruptedException
  {
	  String MemID=Excel_Data.getValue(EXCEL_PATH,"Member Details", 2, 0);
	  DashboardPage DP1=new DashboardPage(driver);
	  DP1.ClickMenuOption();
	  Thread.sleep(2000);
	  ManageClaimPage MCP1=new ManageClaimPage(driver);
	  MCP1.Selbusiness();
	  Thread.sleep(1000);
	  MCP1.SearchbyMem();
	  MCP1.EnterMemID(MemID);
	  Thread.sleep(2000);
	  MCP1.Clicksrch();
	  Thread.sleep(2000);
	  MCP1.InsuranceOPSApprove();
  }
	  @AfterMethod
	  public void Logout() throws InterruptedException
	  {
		  DashboardPage L2=new DashboardPage(driver);
			L2.clickLogout();
	  }
	  
  
}
