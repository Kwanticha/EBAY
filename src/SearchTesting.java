import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;;


class SearchTesting {

	@Test
	void testSearchProduct() {
		//Arrange
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//Act
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone 8 Unlocked used");
		driver.findElement(By.id("gh-btn")).click();
		
		//Assert
		String t = "Apple";
		assertTrue(driver.getPageSource().contains("Apple"));
		
		driver.quit();
		
		
	}
	@Disabled
	void testSearchProductFail(){
		fail("Not yet implemented");
	}

}