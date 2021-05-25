package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingTooltip {

	@Test
	public void CapturingTooltip() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		//Switching to Iframe
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Iframe);
		//Capturing Tool Tip
		WebElement Age = driver.findElement(By.xpath("//input[@id='age']"));
		String toolTip = Age.getAttribute("title");
		System.out.println(toolTip);
		driver.close();
	}
}
