package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.Assert;

public class LoginPage 
{
	@FindBy(id="user_id")
	private WebElement unTB;
	@FindBy(id="password")  //
	private WebElement pwTB;
	@FindBy(id="element_button_1")
	private WebElement loginBTN;
	@FindBy(id="popup_ok")
	private WebElement okALT;
	//
	@FindBy(xpath="//*[@id='popup_message']")
	private WebElement errorMSG;
	//@FindBy(xpath="//span[contains(.,'invalid')]")
	//private WebElement errorMSG;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Methods
	public void setuserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	public void clearusername(String un)
	{
		unTB.clear();
	}
	public void clearpassword(String pw)
	{
		pwTB.clear();
	}
	public void clickOKAlert()
	{
		okALT.click();
		
	}
	
	public void verifyErrorMSG(String expectedMSG)
	{
		String actualMSG = errorMSG.getText();
		Assert.assertEquals(actualMSG, expectedMSG);
	}
	
	public void verifyTitle(WebDriver driver,String expTitle)
	{
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log(actTitle,true);
		
		
	}
}

