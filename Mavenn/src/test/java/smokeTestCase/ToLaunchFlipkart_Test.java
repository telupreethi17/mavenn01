package smokeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchFlipkart_Test{
	@Test
	public void LaunchFlipkart() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
