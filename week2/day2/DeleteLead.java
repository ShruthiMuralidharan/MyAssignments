package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		String expectedText = "No records to display";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main"); // Loading URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click(); // click on leads
		driver.findElement(By.linkText("Find Leads")).click(); // click on find leads
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); // click on phone
		driver.findElement(By.name("phoneNumber")).sendKeys("9988776600"); // Enter phone number
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); // click on find leads button
		WebElement firstLeadId = driver.findElement(By.xpath("//a[text()='14876']")); // capture the first lead id
		String resultingFirstLeadId = firstLeadId.getText();
		firstLeadId.click(); // click the first resulting lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click(); // click on delete
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); // click find leads
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(resultingFirstLeadId); // search by lead id

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); // click on find leads button
		String findLeadResultText = driver.findElement(By.xpath("//div[text()='No records to display']")).getText(); // verify
																														// the
																														// message
		if (findLeadResultText.equals(expectedText)) { 
			System.out.println("Lead Deleted Successfully");
		}
		driver.close(); //close the tab
	}

}