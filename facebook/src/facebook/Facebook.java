package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void a()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SHANEE\\Downloads\\geckodriver-v0.26.0-win64.\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shane");
		driver.findElement(By.id("pass")).sendKeys("shane@6617");
		driver.close();
	}
}
