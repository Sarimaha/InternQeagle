package com.incident.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateNewIncident extends BaseClass {
	@Test(dataProvider="dataForCreate")
	public void createIncident(String filter,String description){
		
	driver.findElement(By.id("filter")).sendKeys(filter);
	driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
	driver.switchTo().frame("gsft_main");
	driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
	String createNum=driver.findElement(By.id("incident.number")).getAttribute("value");
	System.out.println("Newly generated Incident Number is : "+createNum);
	driver.findElement(By.id("incident.short_description")).sendKeys(description);
	
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
	
	@DataProvider(name="dataForCreate")
	public String[][] sendData() throws IOException
	{
		ReadExcel re=new ReadExcel();
		String[][] data=re.readData("CreateIncident");
		
		return data ;
		
		
		
	}
}
