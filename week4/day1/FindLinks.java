package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLinks {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://www.facebook.in");
		driver.manage().window().maximize();
		driver.navigate().refresh(); // to refresh page
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		
		//find the links
		// to assign local variable Place after ; and press ctrl+2, then type L 
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); //to find multiple group of elements we use findElements 

		//size of list
		int size = allLinks.size();
		System.out.println(size);
		
		//retrieve single link
		WebElement name= allLinks.get(2);
		String text = name.getText();
		System.out.println(text);
		
		
		List<String> list = new ArrayList<String>();
		
		//Advanced or enhanced for loop
		
		// for (datatype iterator : old variable name )
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2);
			list.add(text2);
			
		}
		System.out.println(list);
	}

}
