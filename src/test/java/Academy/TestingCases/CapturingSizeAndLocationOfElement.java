package Academy.TestingCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingSizeAndLocationOfElement {

	@Test
	public void CapturingSizeAndLocationOfElement() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Capturing Location by GetLocation - Method1
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		System.out.println("Location:" + logo.getLocation());
		System.out.println("Location X:" + logo.getLocation().getX());
		System.out.println("Location Y:" + logo.getLocation().getY());
		
		//Capturing Location by GetRect - Method 2
		//System.out.println("Location:" + logo.getRect());
		System.out.println("Location X:" + logo.getRect().getX());
		System.out.println("Location Y:" + logo.getRect().getY());
		
		//Capturing Size
		System.out.println(logo.getSize());
		System.out.println(logo.getSize().getHeight());
		System.out.println(logo.getSize().getWidth());
		
		//Capturing Dimensions
		System.out.println(logo.getRect().getDimension().getHeight());
		System.out.println(logo.getRect().getDimension().getWidth());
		
	}
}
