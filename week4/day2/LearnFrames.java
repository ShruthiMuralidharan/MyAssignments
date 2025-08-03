package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {
	/*
	exceptions
	No such element exception --when do we get 
	1) when locator goes wrong
	2) when proper wait statements are not provided
	3) Webelement trying to interact with it, is present inside a frame
	*/
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.leafground.com/frame.xhtml");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.id("Click")).click(); // will not work as we have not handled the frame and throws no such element exception
		 
		//lets handle the frame
		driver.switchTo().frame(0); // using index as there are no other attributes inside that frame
		driver.findElement(By.id("Click")).click(); 
			

	}

}
