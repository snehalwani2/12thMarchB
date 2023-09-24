package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePAge 
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid;
	
	
	public KiteHomePAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getKiteHomePageUserID()
	{
		String actUserID=userid.getText();
		return actUserID;
	}
	
		
	
	
/*	public void verifyKiteHomePAgeUserID(String expuserid)
	{
		String actuserid=userid.getText();
		
		
		if(actuserid.equals(expuserid))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}  */
	
	}
	
	
	
	


