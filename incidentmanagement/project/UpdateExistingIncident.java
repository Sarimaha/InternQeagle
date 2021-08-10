package com.incidentmanagement.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateExistingIncident {

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
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("INC0010763",Keys.ENTER);
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame("gsft_main");
		//System.out.println("switched");
		
		driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).click();
		//a[contains(@class, 'linked formlink')
		WebElement urgency=driver.findElement(By.id("incident.urgency"));
		Select urgencySelect=new Select(urgency);
		urgencySelect.selectByVisibleText("1 - High");
				WebElement state=driver.findElement(By.id("incident.state"));
		Select stateSelect=new Select(state);
		stateSelect.selectByVisibleText("In Progress");
		driver.findElement(By.id("sysverb_update_bottom")).click();
		//System.out.println("clicked");
		
		driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).click();
		
		WebElement checkurgency=driver.findElement(By.id("incident.urgency"));
		Select urgencyAfter=new Select(checkurgency);
		String updatedUrgency=urgencyAfter.getFirstSelectedOption().getText();
		System.out.println("The updated value of Urgency is :"+updatedUrgency);
		
		
		WebElement checkState=driver.findElement(By.id("incident.state"));
		Select stateAfter=new Select(checkState);
		String updatedState=stateAfter.getFirstSelectedOption().getText();
		System.out.println("The updated value of State is :"+updatedState);
		
		
	}

}
