package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week2CaseStudyAmazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("t-Shirt");//search for any product
		driver.findElement(By.id("nav-search-submit-button")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll down
		js.executeScript("window.scrollBy(0, 500)");

		driver.findElement(By.xpath("//span[contains(text(),'t Shirt')]")).click(); // click on particular product
		driver.findElement(By.id("add-to-cart-button")).click(); // Add to cart

		String verifyMessage = driver.findElement(By.xpath("//h1[contains(text(),'Added')]")).getText();
		if (verifyMessage.contains("Added to cart")) { //verify product added to cart
			System.out.println("Product added to the cart Successfully");
		}

	}
}