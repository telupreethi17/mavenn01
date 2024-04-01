package integrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchMaybelin_Test {
	@Test
	public void LaunchMaybelin() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.maybelline.co.in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
