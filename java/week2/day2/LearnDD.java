package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	public static void main(String[] args) {
		
	
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	
	ChromeDriver driver=new ChromeDriver(options);
	//go to webpage
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//enter username
	driver.manage().window().maximize();
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	 //enter password
	WebElement pwd = driver.findElement(By.name("PASSWORD"));
	pwd.sendKeys("crmsfa");
	
	//click submit
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	
	//click on leads
	driver.findElement(By.linkText("Leads")).click();
	
	//click on create lead
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	
	//click on sourceDD
	WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sel=new Select(sourceDD );
	sel.selectByIndex(4);
	
	//click on marketing Campaign
	WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select sel1=new Select(marketingDD);
sel1.selectByVisibleText("Automobile");
	
	//click on ownership
	WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select sel2=new Select(ownershipDD);
	sel2.selectByValue("OWN_CCORP");
		
		//industry
	WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select sel3=new Select(industryDD);
	sel3.selectByValue("IND_GEN_SERVICES");
	
	//click Create Lead
	driver.findElement(By.className("smallSubmit")).click();
	
	//verify title
	String title=driver.getTitle();
	System.out.println("Page title is : "+ title);
	driver.close();

	
	

}
}
