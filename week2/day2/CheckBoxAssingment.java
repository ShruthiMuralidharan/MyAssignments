package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxAssingment {

	public static void main(String[] args) {
		String expectedMessage = "Checked";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://leafground.com/checkbox.xhtml"); //loading URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click(); //Click on Basic check box
driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click(); // Click on Ajax check box
		String webMessage = driver.findElement(By.xpath("//span[text()='Checked']")).getText(); // storing the pop up text

		if (webMessage.equals(expectedMessage)) { // verify correct pop up is displayed
			System.out.println("Expected message is displayed");
		} else {
			System.out.println("Expected message is not displayed");
		}
		driver.findElement(By.xpath("//label[contains(text(),'Java')]")).click(); // click on java check box 
		driver.findElement(By.xpath("//label[contains(text(),'Python')]")).click(); // click on Python check box 
		driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c')]/parent::div")).click(); // click on tri state check box 
		String triCheckBoxCurrentState = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText(); // storing pop up message
		if (triCheckBoxCurrentState.equals("State = 1")) { // verify which state is popped up
			System.out.println("TriState Option Selected is " + triCheckBoxCurrentState);
		}
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click(); // click on toggle switch
		String toggleStatus = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText(); // storing pop up message 
		if (toggleStatus.equals("Checked")) { //verify the pop up message
			System.out.println("Toogle Switch is Checked");
		}
		boolean status = driver	.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-icon ui-icon-blank ui-c')]/parent::div")).isEnabled(); //to verify check box is disabled
		if (status == false) {
			System.out.println("checkbox is enabled");
		} else {
			System.out.println("checkbox is Disabled");
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click(); // click on drop down
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click(); //selecting country
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click(); //closing drop down
		driver.close();
	}
}