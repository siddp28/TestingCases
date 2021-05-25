package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningLinkInNewTab {

	@Test
	public void OpeningLinkInNewTab() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		driver.close();
	}
}
