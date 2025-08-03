package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnNestedFrame {
	/*
	 * no such frame exception 
	 * parent frame -- switch back to immediate parent frame
	 * default content --- switch out of all the frames
	 */
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.leafground.com/frame.xhtml");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//nested Frame
		//1st handle outer frame then handle inner frame
		WebElement nesFrame = driver.findElement(By.xpath("//h5[contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nesFrame);
		//innerframe
		driver.switchTo().frame("frame2");
		//webelemrnt
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame(); //immediately switches to the immediate parent frame
		driver.switchTo().defaultContent(); // it comes out of all the frames

	}

}
