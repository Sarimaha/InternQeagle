package com.incident.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UpdateExistingIncident extends BaseClass {
	@Test(dataProvider="dataForUpdate")
	public void update(String incidentNum,String urgencyValue)
	{
		///String incidentNum="INC0011135";
	driver.findElement(By.id("filter")).sendKeys("Incident");
	driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
	driver.switchTo().frame("gsft_main");
	
	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	search.sendKeys(incidentNum,Keys.ENTER);
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame("gsft_main");
	//System.out.println("switched");
	
	driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).click();
	
	WebElement urgency=driver.findElement(By.id("incident.urgency"));
	Select urgencySelect=new Select(urgency);
	urgencySelect.selectByVisibleText(urgencyValue);
	
	WebElement state=driver.findElement(By.id("incident.state"));
	Select stateSelect=new Select(state);
	stateSelect.selectByVisibleText("In Progress");
	driver.findElement(By.id("sysverb_update_bottom")).click();
		
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
	
	@DataProvider(name="dataForUpdate")
	public String[][] sendData() throws IOException
	{
		ReadExcel re=new ReadExcel();
		String[][] data=re.readData("UpdateIncident");
		
		return data ;
		
		
		
	}

}
