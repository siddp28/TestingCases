package Academy.TestingCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogle {

	@Test
    public void exampleOfTestNgMaven() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        System.out.println("This is TestNG-Maven Example");
    }
}
