package Academy.TestingCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInMultipleTabAndWindow {

	@Test
	public void OpenInMultipleTabAndWindow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Opening link in New Tab.
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// Opening Link in new Window
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
	}
}
