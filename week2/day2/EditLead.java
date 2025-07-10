package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main"); // Loading URL
		driver.manage().window().maximize();
		// Login into leaftaps
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// clicking in CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		// click on leads
		driver.findElement(By.linkText("Leads")).click();
		// click on create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter required information
		driver.findElement((By.xpath("//input[@id='createLeadForm_companyName']"))).sendKeys("Info");
		driver.findElement((By.xpath("//input[@id='createLeadForm_firstName']"))).sendKeys("testing");
		driver.findElement((By.xpath("//input[@id='createLeadForm_lastName']"))).sendKeys("Edit");
		driver.findElement((By.xpath("//input[@id='createLeadForm_firstNameLocal']"))).sendKeys("localName");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is test lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vyugaRaghul1@gmail.com");

		// selecting state/province from drop down
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1 = new Select(stateDD);
		sel1.selectByVisibleText("New York");

		// click on create lead
		driver.findElement(By.className("smallSubmit")).click();

		// click on edit lead

		driver.findElement(By.linkText("Edit")).click();
		// clear description

		driver.findElement(By.id("updateLeadForm_description")).clear();
		// entering important note text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared the description");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click(); // submit

		System.out.println(driver.getTitle()); // get the title and print in console
		driver.close();
	}

}