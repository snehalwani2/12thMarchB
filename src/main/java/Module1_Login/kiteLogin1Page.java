package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1Page 
{

	// step 1
		@FindBy(xpath="//input[@id='userid']")private WebElement UN; // private WebElement UN=driver.findElement(by.xpath("");
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;// private WebElement pwd=driver.findElement(by.xpath("");
	    @FindBy(xpath="//button[text()='Login ']")private	WebElement loginbtn;// private WebElement clickonloginbtn=driver.findElement(by.xpath("");
		
// step 2
	   public kiteLogin1Page(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	   // step 
	    public void inpkiteLogin1PageUsername(String username)
	    {
	    	UN.sendKeys(username);
	    }
	    
	    public void inpkiteLogin1PagePassword(String password)
	    {
	    	PWD.sendKeys(password);
	    }
	    
	    public void clickkiteLOgin1PageLoginBtn()
	    {
	    	loginbtn.click();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
