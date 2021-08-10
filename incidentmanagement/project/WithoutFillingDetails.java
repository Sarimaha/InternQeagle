package com.incidentmanagement.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutFillingDetails {

	public static void main(String[] args) {
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
		//driver.findElement(By.xpath("(//div[@class='sn-widget-list-title' and ./text()='Incidents'])[2]")).click();
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		String createNum=driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Newly generated Incident Number is : "+createNum);
		
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		String error=driver.findElement(By.xpath("//span[@class='outputmsg_text']")).getText();
		System.out.println(error);
		String msg="The following mandatory fields are not filled in: Short description, Caller";
		if(error.equals(msg))
			System.out.println("The Error Message is thrown successfully");
		else
			System.out.println("The Error Message is not thrown");
			
		
	}

}
