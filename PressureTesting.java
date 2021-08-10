import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PressureTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.bbc.co.uk/weather");
		driver.findElement(By.id("ls-c-search__input-label")).sendKeys("Chennai,India");	
		driver.findElement(By.xpath("//span[text()='Chennai, India']")).click();

		driver.findElement(By.xpath("//span[text()='21']")).click();
		String todayPressure=driver.findElement(By.xpath("//span[text()='21']/ancestor::div[@class='wr-time-slot-primary wr-js-time-slot-primary']/following-sibling::div//dt[text()='Pressure']/following::dd")).getText();
		String todayNumber=todayPressure.replaceAll("[\\D]","");
		int todayFinal=Integer.parseInt(todayNumber);
				
		driver.findElement(By.id("daylink-1")).click();
		
		driver.findElement(By.xpath("//span[text()='21']")).click();
		String tomoPressure=driver.findElement(By.xpath("//span[text()='21']/ancestor::div[@class='wr-time-slot-primary wr-js-time-slot-primary']/following-sibling::div//dt[text()='Pressure']/following::dd")).getText();
		String tomoNumber=tomoPressure.replaceAll("[\\D]","");
		int tomoFinal=Integer.parseInt(tomoNumber);
		System.out.println("The difference between today's and tomorrow's pressure is : "+(todayFinal-tomoFinal));
		
		
	}

}
