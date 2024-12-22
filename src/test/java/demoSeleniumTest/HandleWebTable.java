package demoSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://qa-automation-practice.netlify.app/web-table");
		
		// find 2nd cell in 3rd row
		String webCell = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		
		System.out.println(webCell);
		
        // Find all rows
        List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rowList.size());

        // Find all columns in the 2nd row (data row)
        List<WebElement> colList = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
        System.out.println("Number of columns: " + colList.size());

        // Iterate through data rows and columns
        for (int r = 2; r <= rowList.size(); r++) { // Start from row 2
            for (int c = 1; c <= colList.size(); c++) {
                String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.print(data + "\t");
            }
            System.out.println(); // Newline after each row
        }

        // Close the browser
        driver.close();
    }
}