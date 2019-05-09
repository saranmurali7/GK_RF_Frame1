package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	@FindBy(xpath="//*[@id='btn_icon_icon-off']")
	private WebElement lgotICN;
	@FindBy(id="popup_ok")
	private WebElement Ok;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div[1]/ul/li[2]/a")
	private WebElement menuOPN;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div[1]/ul/li[4]/a")
	private WebElement impdatamenuOPN;
	public DashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	//Click on Logout Icon
	public void clickLogout() throws InterruptedException
	{
		lgotICN.click();
		Thread.sleep(1000);
		Ok.click();
	}
	
	public void ClickMenuOption()
	{
		menuOPN.click();
		
	}
	public void clickImport()
	{
		impdatamenuOPN.click();
	}

}
