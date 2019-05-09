package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;


public class ImportData 
{
	@FindBy(id="business")
	private WebElement bsns;
	@FindBy(xpath="//*[@id='element_hyperlink_6']")
	private WebElement ldLNK;
	public ImportData(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Upload_RF() throws InterruptedException, AWTException
	{
		Select sel1=new Select(bsns);
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		ldLNK.click();
		Robot R1=new Robot();
		for(int i=1;i<=9;i++)
		{
		R1.keyPress(KeyEvent.VK_DOWN);
		R1.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		R1.keyPress(KeyEvent.VK_ENTER);
		R1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	
	}
	

}
