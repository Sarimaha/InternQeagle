package com.changemanagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewChange {

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

		driver.findElement(By.id("filter")).sendKeys("Change");

		driver.findElement(By.xpath("(//div[text()='Create New'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("(//div[@class='change-model-card-component'])[2]")).click();
		String changeRequest=driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println("CHange Request Number created is :"+changeRequest);
		driver.findElement(By.id("change_request.short_description")).sendKeys("Short description");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys(changeRequest,Keys.ENTER);
		String text=driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).getText();
		
		if(text==changeRequest)
			System.out.println("Change Request is created successfully");
		else
			System.out.println("Change request is not created");
	}

}
