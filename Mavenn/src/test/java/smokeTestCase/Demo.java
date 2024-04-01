package smokeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void opendemo() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
