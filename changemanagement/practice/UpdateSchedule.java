package com.changemanagement.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String changeReq="CHG0030613";
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
		//	data-original-title Close Connect Sidebar
		driver.findElement(By.xpath("//span[text()='Schedule']")).click();
		//2021-08-05 16:02:50  2021-08-10 16:04:11 2021-08-20
		driver.findElement(By.id("change_request.start_date")).sendKeys("2021-09-05 16:02:50");

		driver.findElement(By.id("change_request.end_date")).sendKeys("2021-09-10 16:04:11");
		driver.findElement(By.id("label.ni.change_request.cab_required")).click();
		driver.findElement(By.id("change_request.cab_date")).sendKeys("16:04:11 2021-08-20");
		driver.findElement(By.id("sysverb_update_bottom")).click();
		
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys(changeReq,Keys.ENTER);
		String incNum=driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).getText();
		System.out.println("Incident Number is :"+incNum);
		String startDate=driver.findElement(By.xpath("(//div[@class='datex date-calendar'])[1]")).getText();
		
		String endDate=driver.findElement(By.xpath("(//div[@class='datex date-calendar'])[2]")).getText();
		
		if ((startDate.equals("2021-09-05 16:02:50"))&&(endDate.equals("2021-09-10 16:04:11")))
			System.out.println("Change request Start Date and End Date are updated correctly");
		else
			System.out.println("Dates are not updated");
	}

}
