package Alert;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkAlert {
	public static void main(String args[]) throws InterruptedException
	{
		System.getProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("accepted");
		//Thread.sleep(5);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframeResult");
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.getWindowHandles();

	}

	private static void getWindowHandles() {
		// TODO Auto-generated method stub
		
	}

}