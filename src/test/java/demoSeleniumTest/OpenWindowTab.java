package demoSeleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWindowTab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//open url
		driver.get("https://www.google.com/");
		System.out.println("First Page: "+ driver.getTitle());
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Second Page: "+ driver.getTitle());
		
		//get window handles 
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		
		driver.switchTo().window(handles.get(0)); //google window index 0
		System.out.println("First Page: "+ driver.getTitle());
		
		
		
		
	}

}
