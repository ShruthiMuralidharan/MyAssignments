package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableErail {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("https://erail.in/");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
			fromStation.clear();
			fromStation.sendKeys("MAS",Keys.TAB);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
			toStation.clear();
			toStation.sendKeys("MDU",Keys.TAB);
		
		WebElement chkDate = driver.findElement(By.id("chkSelectDateOnly"));
			chkDate.click();
		
		//Display only train names
		// get all train names and store them in a list
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		//now display all the train names
		for (WebElement iter : trainNames) {
			System.out.println(iter.getText());
					
		}
		
		//row count
		int size = trainNames.size();
		System.out.println(size);

	}

}
