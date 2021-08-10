package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {
	
	
	public static void main(String args[])
	{
	System.getProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//img[@alt='Alert']")).click();
	System.out.println("opened");
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	System.out.println("alert closed");
	//().chromeDriver().setup();
	driver.close();
	}
}

