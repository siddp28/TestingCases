package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionMultipleKeys {

	@Test
	public void KeyboardActionMultipleKeys() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://textcompare.com/");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/textarea[1]"));
		WebElement input2 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/textarea[1]"));
		
		input1.sendKeys("Welcome To Selenium");
		Actions act = new Actions (driver);
		
		//CLT + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CLT + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB - Switch to Input2
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//CLT + V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Compare Text
		if (input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Text Copied");
		else
			System.out.println("Text not copied");
		
	}
}
