package demoSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://qa-automation-practice.netlify.app/file-upload");
		
		//choose file element
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file_upload']"));
		
		//send file
		chooseFile.sendKeys("C:\\Users\\Rayya\\Downloads\\obama.jpg");
		
		
	}

}
