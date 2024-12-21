package demoSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		
		List<WebElement> radioList = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		System.out.println("Total radio buttons: "+ radioList.size())	;

	WebElement selectButton = driver.findElement(By.id("radio-button3"));
	selectButton.click();
		
		driver.close();
		
		
		
	}

}

