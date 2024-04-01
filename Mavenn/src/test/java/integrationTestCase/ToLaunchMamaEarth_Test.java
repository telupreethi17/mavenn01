package integrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchMamaEarth_Test {
	@Test
	public void LaunchMamaEarth() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://mamaearth.in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
