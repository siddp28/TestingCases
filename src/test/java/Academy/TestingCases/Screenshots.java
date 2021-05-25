package Academy.TestingCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	@Test
	public void Screenshots() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full Page Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		//Screenshot of Section of page
		WebElement src1 = driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]"));
		File srcOne =src1.getScreenshotAs(OutputType.FILE);
		File trgOne = new File (".\\Screenshots\\Featured.png");
		FileUtils.copyFile(srcOne, trgOne);
		
		//Screenshot of Specific Element
		WebElement src2 = driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
		File srcTwo =src2.getScreenshotAs(OutputType.FILE);
		File trgTwo = new File (".\\Screenshots\\Logo.png");
		FileUtils.copyFile(srcTwo, trgTwo);

	}
}
