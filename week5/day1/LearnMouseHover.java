package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//locate the element
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		//instantiate the action class
		Actions builder = new Actions(driver);
		
		//using the objects call the req method
		builder.moveToElement(prime).perform(); // perform is mandatory to perform the action.if not given we wont even get an exception to find what the error is
		
		//this does not clicks it. just MouseHover on it
		

	}

}
