package demoSeleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://qa-automation-practice.netlify.app/iframe");
		
		//full page screen shot
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File ("C:\\Users\\Rayya\\eclipse-workspace\\SeleniumMavenDemo\\screenshot\\Fullimage.png");
		
		FileUtils.copyFile(src, dest);
		System.out.println("---------------------------------------------");
		
		
		//take screen shot of a web page
		
		
		
		WebElement table = driver.findElement(By.xpath("//iframe[@id='iframe-checkboxes']"));
		
		File src1 = table.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File ("C:\\Users\\Rayya\\eclipse-workspace\\SeleniumMavenDemo\\screenshot\\Frameimage.png");
		
		FileUtils.copyFile(src1, dest1);
		
		driver.close();
		
		
	}

}
