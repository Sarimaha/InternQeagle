package com.incident.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident extends BaseClass  {
@Test
public void assign()
{
	
	
	String incidentNum="INC0011131";

	driver.findElement(By.id("filter")).sendKeys("Incident");
	driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Open']")).click();
	driver.switchTo().frame("gsft_main");

	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	search.sendKeys(incidentNum,Keys.ENTER);

	driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();

	driver.findElement(By.id("lookup.incident.assignment_group")).click();

	Set<String> handles1=driver.getWindowHandles();
	
	List<String> listHandle1=new ArrayList<String>(handles1);
	String parentWindow=listHandle1.get(0);
	String assignGroupWindow=listHandle1.get(1);
	driver.switchTo().window(assignGroupWindow);

	driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input")).sendKeys("Software",Keys.ENTER);         
	driver.findElement(By.xpath("//a[text()='Software']")).click();
	driver.switchTo().window(parentWindow);
	driver.switchTo().frame("gsft_main");

	driver.findElement(By.id("lookup.incident.assigned_to")).click();

	Set<String> handles2=driver.getWindowHandles();
	//System.out.println(handles2);
	List<String> listHandle2=new ArrayList<String>(handles2);
	String assignToWindow=listHandle2.get(1);
	driver.switchTo().window(assignToWindow);

	driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input")).sendKeys("ITIL User",Keys.ENTER);


	//driver.switchTo().window(newWindow);
	driver.findElement(By.xpath("//a[text()='ITIL User']")).click();
	driver.switchTo().window(parentWindow);
	driver.switchTo().frame("gsft_main");
	String notes="Updating work notes";
	driver.findElement(By.id("activity-stream-textarea")).sendKeys(notes);
	driver.findElement(By.id("sysverb_update_bottom")).click();

	WebElement search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	search2.sendKeys("INC0011131",Keys.ENTER);
	//driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();
	String  get=driver.findElement(By.xpath("//a[contains(text(),'Software')]")).getText();
	if(get.equals("Software"))
		System.out.println("Incident is assigned to Software group successfully");
	else
		System.out.println("Incident is not assigned correctly");

}
}
