package week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh(); // to refresh page
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
		
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Print the total number of results
		String noOfResults = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(noOfResults);
		
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(3000);
		
		//Print the total number of results
		String noOfResults1 = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(noOfResults1);
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		Thread.sleep(3000);
		
		//Print the first resulting bag info (name)
		String firstResultingBag = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/span")).getText();
		System.out.println("Print the first resulting bag info (name)"+firstResultingBag);
		
		//Print the first resulting bag info (discounted price)
		String discountedPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		System.out.println("Print the first resulting bag info (discounted price) "+discountedPrice);
		
		//Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		
		driver.close();

		
		
	}

}
