package page;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class InitiateClaimPage 
{
	@FindBy (id="member_death_btn")
	private WebElement dtICN;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div")
	private WebElement dtbckARW;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement setBTN;
	@FindBy(css=".dw-cal-slide-a .dw-cal-row:nth-child(3) > .dw-cal-day:nth-child(3) .dw-cal-day-fg")
	private WebElement dtopn;
	@FindBy(id="member_cause")
	private WebElement COD;
	@FindBy(id="memeber_decease_name")
	private WebElement otIB;
	@FindBy(id="element_text_2")
	private WebElement dtctFUB;
	@FindBy(id="element_text_4")
	private WebElement kycFUB;
	@FindBy(id="next_btn")
	private WebElement nxtBTN;
	@FindBy(id="comments_box")
	private WebElement cmntBOX;
	@FindBy(linkText="Submit")
	private WebElement subBTN;
	@FindBy(id="popup_ok")
	private WebElement popOK;
	
	
	public InitiateClaimPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void SetDate() throws InterruptedException
	{
		dtICN.click();
		dtbckARW.click();
		dtbckARW.click();
		Thread.sleep(2000);
		dtopn.click();
		setBTN.click();
	}
	
	public void SetCauseofDeath() throws InterruptedException
	{
		Select sel1=new Select(COD);
		sel1.selectByIndex(3);
		Thread.sleep(2000);
		otIB.sendKeys("Died Due To Heart Attack");
	}
	public void ClickNext()
	{
		nxtBTN.click();
		
	}
	public void FileUploadDeathCrt() throws AWTException, InterruptedException
	{
		Robot R1=new Robot();
		dtctFUB.click();
		for(int i=1;i<=9;i++)
		{
		R1.keyPress(KeyEvent.VK_DOWN);
		R1.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_ENTER);
		R1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		for(int i=0;i<=7;i++)
		{
			R1.keyPress(KeyEvent.VK_DOWN);
			R1.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_ENTER);
		R1.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	public void FileUploadKYCDoc() throws AWTException, InterruptedException
	{
		Robot R1=new Robot();
		kycFUB.click();
		
		for(int i=0;i<=7;i++)
		{
			R1.keyPress(KeyEvent.VK_DOWN);
			R1.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_ENTER);
		R1.keyRelease(KeyEvent.VK_ENTER);
	}
	public void EnterCmntBox()
	{
		cmntBOX.sendKeys("Test Claim Initiate");
	}
	
	public void clickSubmit() throws InterruptedException
	{
		subBTN.click();
		Thread.sleep(1000);
		popOK.click();
	}
	
	

}
