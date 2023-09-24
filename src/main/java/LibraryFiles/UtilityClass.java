package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

// This method is use to get test data fro excel sheet
//Need to provide 2 inputs: 1-rowIndex, 1-colIndex
// @ Author name-Snehal
public class UtilityClass 
{
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\Maven1\\TestData\\kite1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		 
		return value;
	}
	
	
	// This method is use to capture screenshot of webpage
	// need to provide 2 inputs: 1-webdriver object, 2-TCID
	// @ Author Name-Snehal
	public static void captureScrrenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Saurabh\\eclipse-workspace\\Maven1\\Screenshots\\TestCaseID"+TCID+".png");
		FileHandler.copy(src, dest);
		
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\Maven1\\propertyfile.properties");
	    
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	
	// 1 Here we provide path of property file into fileInputStream.then
	// 2 create the object of 'properties' class
	// 3 In properties class there is a non static method "load". Call the method and provide the input of "fileInputStram class object"
	// 4 call getProperty method and send key(URL,UN,PWD,PIN)

}
