package Academy.TestingCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Epicor {

	@SuppressWarnings("deprecation")
	@Test
	public void Epicor() throws InterruptedException, IOException {
		// Initializing Driver
	//	WebDriverManager.internetExplorer().setup();
		//WebDriverManager.InternetExplorer.setup();
		// Defining System Property for the IEDriver 
		System.setProperty("webdriver.ie.driver", "E:\\Testing\\Selenium\\Selenium Drivers\\IEDriverServer.exe"); 

		// Instantiate a IEDriver class. 
		WebDriver driver=new InternetExplorerDriver();
		

		// Opening Url & maximize it.
		driver.get("http://125.18.224.122/ERP10Demo-EWA/ice.ewa.syslogin.aspx?Return=ice.ewa.shell.aspx");
	

		// Entering Credentials & Submit.
		driver.findElement(By.id("txtUserID")).clear();
		driver.findElement(By.id("txtUserID")).sendKeys("manager");
		driver.findElement(By.id("txtPassword")).sendKeys("manager");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);

		// Adding Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Switch to Frame & clicking on links
		driver.switchTo().frame("menu");
		driver.findElement(By.linkText("Epicor Education")).click();
		driver.findElement(By.linkText("Financial Management")).click();
		driver.findElement(By.linkText("General Ledger")).click();
		driver.findElement(By.linkText("Setup")).click();
		driver.findElement(By.linkText("General Ledger Account")).click();

		// Fetching window handle & moving to new tab.
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		//Again
		//driver.findElement(By.id("txtUserID")).clear();
	//	driver.findElement(By.id("txtUserID")).sendKeys("manager");
	//	driver.findElement(By.id("txtPassword")).sendKeys("manager");
	//	driver.findElement(By.id("btnLogin")).click();
		

		// Connecting & Fetching Excel Sheet.
		FileInputStream fis = new FileInputStream("E:\\Testing\\GLAccount.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("Sheet1");

		//Passing data from excel & adding it.
		int row = sheet.getLastRowNum();
		sheet.getRow(0).getLastCellNum();
		for (int i = 1; i < 2; i++) {
			HSSFRow currentRow = sheet.getRow(i);
			HSSFCell code = currentRow.getCell(0);
			String st = code.toString();
			char[] ch = st.toCharArray();
			String str = String.valueOf(ch);
			str = str.replaceAll("-", "");
			driver.findElement(By.xpath("//input[@id='glaeGLAccount_dropText']")).sendKeys(str);
			driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
		}
	}
}
