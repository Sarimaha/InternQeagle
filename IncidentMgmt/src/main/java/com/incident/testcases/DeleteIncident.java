package com.incident.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DeleteIncident extends BaseClass  {

	@Test
	public void delete() {

		String incidentNum="INC0011135";
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
		//input[contains(@id,'_text')]
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(incidentNum,Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();
		
		driver.findElement(By.id("sysverb_delete")).click();
		//driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		
		WebElement search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search2.sendKeys(incidentNum,Keys.ENTER);
		WebElement noRecords=driver.findElement(By.xpath("//td[text()='No records to display']"));
		String recordText=noRecords.getText();
		if(recordText.equals("No records to display"))
			System.out.println("Record is deleted successfully");
		else
			System.out.println("Record is not deleted");
		
	}
}
