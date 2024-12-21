package demoSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the link
		driver.get("https://qa-automation-practice.netlify.app/double-click");
		
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@id='double-click-btn']"));
		
		//double click action
		Actions action = new Actions(driver);
		action.doubleClick(clickMeButton).perform();
		 
		//------------------------------------------- 
		
		//drag and drop 
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		
		//source element
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		//target element
		WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		//perform drag and drop action
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		//---------------------------------------------------- 
		
		driver.get("https://qa-automation-practice.netlify.app/mouse-hover");
		
		WebElement element = driver.findElement(By.id("button-hover-over"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
		
		driver.close();
		

	}

}
