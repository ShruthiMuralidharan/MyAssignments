package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {
	/*
	exceptions : 
	1) No alert present exception
	2) Unhandled alert exception -if we do not handle an alert we get this exception
	*/
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		// to switch driver focus to alert box
		Alert alert = driver.switchTo().alert();
		
		
		//to get text of an alert, we have to place it before accepting it or dismissing it 
		//if not we get No alert present exception
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		//to get the text of the confirmation text
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		// to switch driver focus to alert box
		//Alert alert2 = driver.switchTo().alert(); //we need not write it again, we can reuse the 1st one again and again
		alert.dismiss(); 
		
		//prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Saranya");
		alert.dismiss();
		
		//Sweet Alerts - inspectable but cannot be ignored
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		//driver.close();
	}

}
