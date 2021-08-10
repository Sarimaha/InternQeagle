package com.incidentmanagement.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://dev113545.service-now.com/");
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		String createNum=driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Newly generated Incident Number is : "+createNum);
		driver.findElement(By.id("incident.short_description")).sendKeys("Creating New Incident for Practice");
		
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(createNum,Keys.ENTER);
		String searchNum=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println("Incident number used to search is : "+searchNum);
		if(createNum.equals(searchNum))
			System.out.println("Incident number is created successfully");
		else
			System.out.println("There is no match found for the created Incident number");
				
	}

}
