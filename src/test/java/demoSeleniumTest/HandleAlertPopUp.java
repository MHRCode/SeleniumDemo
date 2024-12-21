package demoSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		//click button
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		
		//switch to alert pop up and accept the alert
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
