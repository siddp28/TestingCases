package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChefpinRegisterDiner {
	@Test
	public void ChefpinRegisterDiner() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Opening Url & maximize it.
		driver.get("https://chefp.in/");
		driver.manage().window().maximize();
		
		//Click on CreateAccount
		driver.findElement(By.linkText("Create an Account")).click();
		
	}
}
