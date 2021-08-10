package WebTable;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHomework {
	public static void main(String args[])
	{
		System.getProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		System.out.println("launched");
		//WebElement table=driver.findElement(By.id("table_id"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement cols=rows.get(1);
		List<WebElement> column=cols.findElements(By.tagName("td"));
		System.out.println(column.size());
		
		

	
		System.out.println(driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td")).getText());
	
		
				
		
		
		
		
	}

}
