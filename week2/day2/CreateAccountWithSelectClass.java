package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) {
		String expectedAccountName = "Demo Account testing final";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click(); // click on accounts
		driver.findElement(By.linkText("Create Account")).click(); // click on create account
		driver.findElement(By.id("accountName")).sendKeys(expectedAccountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester."); // enter description

		// selecting industry from drop down
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sel1 = new Select(industryDD);
		sel1.selectByIndex(3);

		// selecting ownership from drop down
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(ownershipDD);
		sel2.selectByVisibleText("S-Corporation");

		// selecting source from drop down
		WebElement SourceDD = driver.findElement(By.id("dataSourceId"));
		Select sel3 = new Select(SourceDD);
		sel3.selectByValue("LEAD_EMPLOYEE");

		// selecting marketing campaign from drop down
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select sel4 = new Select(marketingCampaignDD);
		sel4.selectByIndex(6);

		// selecting state from drop down
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5 = new Select(stateDD);
		sel5.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		String accoutNameFromWeb = driver.findElement(By.xpath("//span[contains(text(),'Demo Account testing')]"))
				.getText(); // get the account name
		if (accoutNameFromWeb.contains(expectedAccountName)) { // verify the account name
			System.out.println("Account name is displayed correctly");

		} else {
			System.out.println("Account name is not displayed correctly");
		}
		driver.close(); // close the tab
	}
}