package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// scroll down to the end
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		
		Actions sd=new Actions(driver);
		sd.scrollToElement(scroll).perform();
		
		//to get the text
		String text = scroll.getText();
		System.out.println(text);
		
		//click Amazon Business. We can also locate the element dorectly and click. his is just shown as an example of Action class.
		WebElement cli = driver.findElement(By.xpath("//h5[contains(text(), 'Business')]"));
		sd.click(cli).perform();
		

		

	}

}
