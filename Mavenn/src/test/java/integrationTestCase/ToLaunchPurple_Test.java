package integrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchPurple_Test {
	@Test
	public void LaunchPurple() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.purplle.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
