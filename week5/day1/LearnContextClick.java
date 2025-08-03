package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		//instantiate
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		
		
		

	}

}
