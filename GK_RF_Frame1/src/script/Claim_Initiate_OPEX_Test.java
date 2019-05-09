package script;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.InitiateClaimPage;
import page.LoginPage;
import page.ManageClaimPage;
//Verify and Validate the functionality of claim initiate by an Operation executive for retail finance customers

public class Claim_Initiate_OPEX_Test extends BaseTest
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
	


  @Test(priority=4,groups={"Claim_Management","smoke"})
  public void Claim_initiate() throws InterruptedException, AWTException 
  {
	  
	  String MemID=Excel_Data.getValue(EXCEL_PATH,"Member Details", 2, 0);
	  DashboardPage DP1=new DashboardPage(driver);
	  DP1.ClickMenuOption();
	  Thread.sleep(2000);
	  ManageClaimPage MCP1=new ManageClaimPage(driver);
	  InitiateClaimPage ICP1=new InitiateClaimPage(driver);
	  MCP1.SearchbyMem();
	  Thread.sleep(1000);
	  MCP1.EnterMemID(MemID);
	  Thread.sleep(2000);
	  MCP1.Clicksrch();
	  Thread.sleep(2000);
	  MCP1.ClickInitiate();
	  Thread.sleep(2000);
	  ICP1.SetDate();
	  Thread.sleep(2000);
	  ICP1.SetCauseofDeath();
	  Thread.sleep(1000);
	  ICP1.ClickNext();
	  Thread.sleep(2000);
	  ICP1.FileUploadDeathCrt();
	  Thread.sleep(1000);
	  ICP1.FileUploadKYCDoc();
	  Thread.sleep(1000);
	  ICP1.clickSubmit();
	  
	  
	  /*WebElement sel1=driver.findElement(By.id("claim_dropdown"));
	  Select s1=new Select(sel1);
	  s1.selectByIndex(1);
	  */
	 }
  
  @AfterMethod
  public void Logout() throws InterruptedException
  {
	  DashboardPage L2=new DashboardPage(driver);
		L2.clickLogout();
  }
}
