import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myclass extends Parameters {

	@BeforeTest
	public void Setup() {
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void AddTwoItems() throws InterruptedException {
		driver.get(myWebsite);
		login();
		Add(2, "Fleece", "Onesie");
		Thread.sleep(3000);
		logout();
	}

	@Test(priority = 3)
	public void AddThreeItems() throws InterruptedException {
		driver.get(myWebsite);
		login();
		Add(3, "Fleece", "all", "Backpack");
		Thread.sleep(3000);
		logout();
	}

	@Test(priority = 1)
	public void AddFourItems() throws InterruptedException {
		driver.get(myWebsite);
		login();
		Add(4, "Backpack", "Onesie", "Light", "Bolt");
		Thread.sleep(3000);
		logout();
	}

	@AfterTest

	public void Postting() {
	}

}
