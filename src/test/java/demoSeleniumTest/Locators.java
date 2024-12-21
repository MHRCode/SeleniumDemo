package demoSeleniumTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/"	);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.getCurrentUrl();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> list = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("size of list: " + list.size());
		
		System.out.println("-----------------------------------");
		
		driver.get("https://www.calculator.net/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Hyperlink List:   "+ linklist.size());
		
		for (WebElement el: linklist) {
			System.out.println(el.getText());
		}
		
		driver.close();
		
	}

}
