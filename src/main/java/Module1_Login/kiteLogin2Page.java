package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2Page 
{
	
	// step 1
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement cntbtn;
	
	public kiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkiteLogin2PagePin(String pininfo)
	{
		pin.sendKeys(pininfo);
	}
	
	public void clickkiteLoginPage2CntBtn()
	{
		cntbtn.click();
	}
	

}
