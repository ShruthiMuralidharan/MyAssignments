package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssingnment {

	public static void main(String[] args) {
		String expectedTitle = "View Lead | opentaps CRM"; // declaring expected title variable and assigning value
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main"); // load URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		// login with user name and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click(); // click on CRM/SFA link
		driver.findElement(By.linkText("Leads")).click(); // click on leads
		driver.findElement(By.linkText("Create Lead")).click(); // click on create lead

		// Entering all required information
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chitra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmanan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Creating Lead");
		driver.findElement(By.className("smallSubmit")).click(); // click on create lead button

		String webTitle = driver.getTitle(); // get the title of web page
		if (webTitle.contains(expectedTitle)) { // verify the title is expected
			System.out.println("Title is Correct");
		} else {
			System.out.println(" Title is Incorrect");
		}
		driver.close();//close the tab
	}
}