package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

import generic.BaseTest;
import generic.IAutoConstants;

public class ManageClaimPage 
{
	WebDriver driver;
	@FindBy(id="claim_dropdown")
	private WebElement clDB;
	@FindBy(id="claim_inputbox")
	private WebElement clIB;
	@FindBy(id="initiate")
	private WebElement iniBTN;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement srchICN;
	@FindBy(linkText="Approve")
	private WebElement appBTN;
	@FindBy(id="element_inputbox_1")
	private WebElement apprTXTBX;
	@FindBy(linkText="Confirm")
	private WebElement appOK;
	@FindBy(id="business_dropdown")
	private WebElement BsdpDWN;
	@FindBy (linkText="Approve")
	private WebElement inopsappBTN;
	@FindBy (id="element_inputbox_1")
	private WebElement inopstxtBOX;
	@FindBy (linkText="Confirm")
	private WebElement inopcnfBTN;
	@FindBy(id="popup_ok")
	private WebElement popOK;
	@FindBy(linkText="Send For Approval")
	private WebElement sfapprBTN;
	/*--------Settlement Related Eelements------------------*/
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr/td[5]")
	private WebElement settlARW;
	@FindBy (xpath="//*[@id='status_btn']")
	private WebElement settapprBTN;
	@FindBy(linkText="Approve")
	private WebElement apprBTN1;
	@FindBy(id="comments_box")
	private WebElement cmntBOX;
	@FindBy(id="update_button")
	private WebElement upBTN;
	@FindBy(linkText="Sent To Insurer")
	private WebElement stiBTN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement calICN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div")
	private WebElement calbckARW;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div/div[1]")
	private WebElement dtselOPN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement dtselBTN;
	@FindBy(linkText="Received From Insurer")
	private WebElement rfiBTN;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[4]/div/div[1]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement rdtcalBTN;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div")
	private WebElement rdtcalbckARW;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div/div[1]")
	private WebElement calsetSEL;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement calselSET;
	@FindBy (xpath="//*[@id='Pay_through_option_NEFT']")
	private WebElement rdBTN;
	@FindBy (xpath="//*[@id='Reference_No']")
	private WebElement refnoIPB;
/*---------------Send to OPEX-----------------*/
	@FindBy (linkText="Send To Operation Executive")
	private WebElement stoexBTN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement calclkBTN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div")
    private WebElement calbckARW1;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[4]/div/div[1]")
	private WebElement calclksetBTN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement calsetBTN;
	
	/*---------------Settled To Nominee-----------------*/
	@FindBy(linkText="Settled To Nominee")
	private WebElement stnBTN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement calclkBTN1;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div")
	private WebElement calbckARW2;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[3]/div/div[1]")
	private WebElement calclksetBTN1;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement calsetBTN1;
	@FindBy(xpath="//*[@id='DischargeVoucher']")
	private WebElement dcvfupBTN;
	//Initialization of elements
	public ManageClaimPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchbyMem()
	{
		Select sl1=new Select(clDB);
		sl1.selectByIndex(1);
		//id="claim_dropdown_option_BorrowerCo-borrower"
	}
	
	public void EnterMemID(String MemID)
	{
		clIB.sendKeys(MemID);
	}
	public void ClickInitiate()
	{
		iniBTN.click();
	}
	public void Clicksrch()
	{
		srchICN.click();
	}
	public void OpmanClickApprove() throws InterruptedException
	{
		appBTN.click();
		Thread.sleep(1000);
		apprTXTBX.sendKeys("Approved");
		appOK.click();
	}
	public void Selbusiness()
	{
		Select sel1=new Select(BsdpDWN);
		sel1.selectByIndex(1);
	}
	public void InsuranceOPSApprove() throws InterruptedException
	{
		inopsappBTN.click();
		inopstxtBOX.sendKeys("Approved Successfully");
		Thread.sleep(2000);
		inopcnfBTN.click();
		popOK.click();//*[@id="Pay_through_option_NEFT"]
	}
/*--------------------Settlement related Methods----------------------------*/
	
	public void InsuranceApprove() throws InterruptedException, AWTException
	{
		Robot R1=new Robot();
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
		Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		sfapprBTN.click();
		Thread.sleep(1000);
		cmntBOX.sendKeys("Approve Settelement");
		upBTN.click();
		Thread.sleep(2000);
		popOK.click();
}
	public void InsurancechkApprove() throws AWTException, InterruptedException
	{
		Robot R1=new Robot();
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
		Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		appBTN.click();
		Thread.sleep(1000);
		cmntBOX.sendKeys("Approve Settelement");
		upBTN.click();
		Thread.sleep(2000);
		popOK.click();
		
	}
	public void SenttoInsurer() throws AWTException, InterruptedException
	{

		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
		Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		stiBTN.click();
		Thread.sleep(1000);
		calICN.click();
		Thread.sleep(1000);
		calbckARW.click();
		Thread.sleep(1000);
		dtselOPN.click();
		Thread.sleep(1000);
		dtselBTN.click();
		cmntBOX.sendKeys("Sent To Insurer");
		Thread.sleep(1000);
		inopcnfBTN.click();
		Thread.sleep(1000);
		popOK.click();
	}
	
	public void ReceivedFromInsurer() throws InterruptedException, AWTException
	{
		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
		Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		rfiBTN.click();
		Thread.sleep(2000);
		rdtcalBTN.click();
		Thread.sleep(1000);
		rdtcalbckARW.click();
		Thread.sleep(1000);
		calsetSEL.click();
		calselSET.click();
		Thread.sleep(1000);
		rdBTN.click();
		refnoIPB.sendKeys("3498");
		inopcnfBTN.click();
		popOK.click();
		}
	
	public void SenttoOPEX() throws InterruptedException, AWTException
	{
		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
		Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		stoexBTN.click();
		Thread.sleep(1000);
		calclkBTN.click();
		Thread.sleep(1000);
		calbckARW1.click();
		Thread.sleep(1000);
		calclksetBTN.click();
		Thread.sleep(1000);
		calsetBTN.click();
		Thread.sleep(1000);
		appOK.click();
		Thread.sleep(1000);
		popOK.click();	
	}
	
    public void Settle_Nominee() throws AWTException, InterruptedException
    {
    	Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		settlARW.click();
    	Thread.sleep(1000);
		R1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		stnBTN.click();
		Thread.sleep(1000);
		calclkBTN1.click();
		Thread.sleep(1000);
		calbckARW2.click();
		Thread.sleep(1000);
		calclksetBTN1.click();
		Thread.sleep(1000);
		calsetBTN1.click();
		Thread.sleep(1000);
		dcvfupBTN.sendKeys("/home/i-exceed.com/saran.muraleedharan/WORK/Framework1/Docs/Discharge_Voucher.pdf");
		Thread.sleep(1000);
		appOK.click();
		Thread.sleep(1000);
		popOK.click();
    }
    
     public void  Settle_NomineeOMConf() throws AWTException, InterruptedException
     {
    	Robot R1=new Robot();
 		R1.keyPress(KeyEvent.VK_DOWN);
 		Thread.sleep(1000);
 		R1.keyRelease(KeyEvent.VK_DOWN);
 		settlARW.click();
     	Thread.sleep(1000);
 		R1.keyPress(KeyEvent.VK_DOWN);
 		Thread.sleep(1000);
 		R1.keyRelease(KeyEvent.VK_DOWN);
 		Thread.sleep(2000);
 		apprBTN1.click();
 		cmntBOX.sendKeys("Approved");
 		inopcnfBTN.click();
 		Thread.sleep(1000);
		popOK.click();
     }
	

}
