package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreationWithSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); // loading URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click(); // click on create new account button
		driver.findElement(By.name("firstname")).sendKeys("Shruthi"); // Entering first name
		driver.findElement(By.name("lastname")).sendKeys("Muralidharan"); // Entering last name

		driver.findElement(By.xpath("//input[contains(@name,'reg_email')][1]")).sendKeys("shruthi2204@yahoo.com"); // Entering
																													// email
																													// id
		driver.findElement(By.id("password_step_input")).sendKeys("SMuralidharan@123"); // Entering password

		// selecting date from drop down
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sel1 = new Select(dayDD);
		sel1.selectByValue("22");

		// selecting month from drop down
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sel2 = new Select(monthDD);
		sel2.selectByValue("4");

		// selecting year from drop down
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sel3 = new Select(yearDD);
		sel3.selectByValue("1991");

		driver.findElement(By.xpath("//input[@id='sex'][1]")).click(); // selecting gender radio button

	}

}