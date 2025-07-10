package week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
			
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(3000);
		
		//select the 2nd visible movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		Thread.sleep(3000);
		
		//select tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		
		//select the 1st displayed movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		Thread.sleep(3000);
		
		//select the 1st displayed time
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		Thread.sleep(3000);
		
		//select Book button
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c']/parent::button)[5]")).click();
		Thread.sleep(3000);
		
		//select Accept
		driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
		Thread.sleep(3000);
		
		//select any available seat
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[2]")).click();
		Thread.sleep(3000);
		
		//display the seat no and grand total
		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();	
		
		System.out.println("Seat number is " +seatNo);
		System.out.println("Grand Total is : Rs."+grandTotal);
		
		//click proceed
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		Thread.sleep(3000);
		
		//Click continue Button
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		Thread.sleep(3000);
		
		//Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		Thread.sleep(3000);
		
		//Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		
		//Close Browser
		driver.close();

	}

}
