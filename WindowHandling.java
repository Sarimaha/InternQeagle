package Alert;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
	
		Set<String> handles=driver.getWindowHandles();
		System.out.println("size is: "+handles.size());
		List listHandle=new ArrayList(handles);
		
	
		
		
		System.out.println(driver.getTitle());
		
	}

}
