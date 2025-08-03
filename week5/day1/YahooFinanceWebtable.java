package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooFinanceWebtable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//mousehover on more
		WebElement more = driver.findElement(By.className("_yb_98mz12"));
		
		//instantiate the action class
		Actions builder = new Actions(driver);
		
		//using the objects call the req method
		builder.moveToElement(more).perform();
		
		
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();



	}

}
