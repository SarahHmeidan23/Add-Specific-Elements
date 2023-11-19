import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	static WebDriver driver = new ChromeDriver();
	static String myWebsite = "https://www.saucedemo.com/";
	static String userName = "standard_user";
	static String password = "secret_sauce";

	static void login() {

		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		userNameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		loginButton.click();
	}

	static void Add(int numberOfItems, String... items) {
		List<WebElement> AddToCart = driver.findElements(By.className("btn"));
		List<WebElement> ProductsNames = driver.findElements(By.className("inventory_item_name"));

		int itemsAdded = 0;

		for (int i = 0; i < ProductsNames.size() && itemsAdded < numberOfItems; i++) {
			String productName = ProductsNames.get(i).getText();

			for (String item : items) {
				if (productName.contains(item)) {
					AddToCart.get(i).click();
					itemsAdded++;
					break;
				}
			}
		}
	}

	static void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("reset_sidebar_link")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	static void AddToCart() {
		List<WebElement> AddToCart = driver.findElements(By.className("btn"));
		for (int i = 0; i < AddToCart.size(); i++) {
			if (i % 2 == 0) {
				AddToCart.get(i).click();
			} else {
				continue;
			}
		}
	}
}
