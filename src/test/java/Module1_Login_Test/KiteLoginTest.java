package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.KiteHomePAge;
import Module1_Login.kiteLogin1Page;
import Module1_Login.kiteLogin2Page;

public class KiteLoginTest extends BaseClass
{
	
	kiteLogin1Page login1; // declare globally
	kiteLogin2Page login2;
	KiteHomePAge home;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		initializeBrowser();
		
		 login1=new kiteLogin1Page(driver);  // initialize locally
		
		 login2=new kiteLogin2Page(driver);
		
		 home =new KiteHomePAge(driver);
			
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inpkiteLogin1PageUsername(UtilityClass.getPFData("UN"));
		login1.inpkiteLogin1PagePassword(UtilityClass.getPFData("PWD"));
		login1.clickkiteLOgin1PageLoginBtn();
		
		login2.inpkiteLogin2PagePin(UtilityClass.getPFData("PIN"));
		login2.clickkiteLoginPage2CntBtn();
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=105;
		String actUserID=home.getKiteHomePageUserID();
		String expUserID=UtilityClass.getTD(0,3);
		
		Assert.assertEquals(actUserID, expUserID,"Failed:both results are different");
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureScrrenshot(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}
