package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//address of current or parent window (Unique address is generated each time we open a window.. even if its the same window)
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow); //A3DAAA48F419BAA50A1A6DD648D5A04E
		System.out.println(driver.getTitle());
		
		//clicking Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//now we have multiple windows. So we are storing the address of all the windows available in a list
		Set<String> childWindow = driver.getWindowHandles();
		
		//declare List
		List<String> listWindow = new ArrayList<String>(childWindow);
		
		//navigating to child window to give control to child
		driver.switchTo().window(listWindow.get(1));
		
		String chWin = driver.getWindowHandle();
		System.out.println(chWin);
		System.out.println(driver.getTitle());
		
		//if there are multiple windows and we do not know the index
		for (String wh : listWindow) {
			driver.switchTo().window(wh);
			System.out.println(driver.getCurrentUrl()); // this will print the URL of each window
		}
		
		// using for loop display all window title
		for (int i = 0; i < listWindow.size(); i++) {
			String win = listWindow.get(i);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
		}
		
		//close the current window
		driver.close();
		
		/*
		 * driver.switchTo().window(listWindow.get(1)); 
		 * As the window is already closed we get NoSuchWindowException. 
		 * We cannot switch to the child window as it is not there. Hence we get this exception
		 */
		
		//to close parent window
		driver.switchTo().window(listWindow.get(0));
		driver.close();
		
		//to close all the windows
		//driver.quit();
		
	}

}
