package smokeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchAjio_Test {
	@Test
	public void launchAjio() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ajio.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
