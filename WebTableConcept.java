package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		WebElement from=driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.TAB);
		
		WebElement to=driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("SRC",Keys.TAB);
		
		////table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]
		
	}

}
