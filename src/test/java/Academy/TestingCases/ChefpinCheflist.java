package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChefpinCheflist {

	@BeforeTest
	public void BeforeChefpinCheflist() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.chefp.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("admin@chefp.in");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("uidm*%$#@.com");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

	@Test
	public void ChefpinCheflist() {
System.out.println("hi");
	}
}
