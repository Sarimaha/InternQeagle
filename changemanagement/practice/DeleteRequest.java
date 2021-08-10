package com.changemanagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String changeReq="CHG0030607";
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
		
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys(changeReq,Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).click();
		
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys(changeReq,Keys.ENTER);
		
		//WebElement search2=driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input"));
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input")).sendKeys(changeReq,Keys.ENTER);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait. until(ExpectedConditions.visibilityOf(search2));
		// search2.sendKeys(changeReq,Keys.ENTER);
		String noRecords=driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
		
		if(noRecords.equals("No records to display"))
			System.out.println("Record is deleted successfully");
		else
			System.out.println("Record is not deleted");
	}

}
