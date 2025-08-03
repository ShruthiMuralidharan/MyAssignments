package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handle the frame
		driver.switchTo().frame(0);
		
		//locate the element to drag and drop
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		//act.dragAndDropBy(drag, 130, 140).perform();
		
		//if location to drag is unknown
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		act.dragAndDropBy(drag, x, y).perform();
				

	}

}
