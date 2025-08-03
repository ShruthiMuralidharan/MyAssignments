package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonMobilePrices {
	

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh(); // to refresh page
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//Search "Mobile Phones" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		Thread.sleep(3000);
		
		//we are recognizing all the places price is displayed
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//size of list (findElements)
		int size = findElements.size();
		System.out.println(size);
		
		//now we create a blank list to store the values (price) 
		List<Long> list = new ArrayList<Long>();
					
				for (WebElement each : findElements) 
				{
					//getting the text from each element i.e the price
					String text = each.getText();
					//removing comma in price, so we can convert to integer
					String replaceAll=text.replaceAll(",","");
					//convert String to long integer
					long mob = Integer.parseInt(replaceAll);
					//Now adding everything to the list
					list.add(mob);
					
				}
				//to sort the list
				Collections.sort(list);
				
				//printing the list i.e the price list
				System.out.println(list);
				
				//size of list
				int size1 = list.size();
				System.out.println(size1); //just for me to verify both list has same values
				
				

	}

}
