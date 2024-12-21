package demoSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the application
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		Thread.sleep(10000);
		
		 
		//select country
		WebElement country = driver.findElement(By.id("country"));
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText("Hong Kong");
		//dropdown.selectByIndex(3);
		
		if (dropdown.isMultiple()==true) {
			System.out.println("Drop down is multiple!");
		}
		else {
			System.out.println("Dropdown is not multiple");
		}

		List<WebElement> ddList = dropdown.getOptions();
		for (WebElement el: ddList) {
			System.out.println("List of Options:   "+ el.getText());
		}
		
	}

}
