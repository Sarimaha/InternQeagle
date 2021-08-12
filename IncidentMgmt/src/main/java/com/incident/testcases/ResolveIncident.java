package com.incident.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ResolveIncident extends BaseClass {
	@Test(dataProvider="dataForResolve")
	public void delete(String incidentNum,String notes) {
		// TODO Auto-generated method stub

		//String incidentNum;

		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Open']")).click();
		driver.switchTo().frame("gsft_main");

		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(incidentNum,Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();

		WebElement state=driver.findElement(By.id("incident.state"));
		Select stateSelect=new Select(state);
		stateSelect.selectByVisibleText("Resolved");

		driver.findElement(By.xpath("//span[contains(text(),'Resolution Information')]")).click();

		WebElement resCode=driver.findElement(By.id("incident.close_code"));
		Select resolutionCode=new Select(resCode);
		resolutionCode.selectByVisibleText("Solved (Permanently)");
		driver.findElement(By.id("incident.close_notes")).sendKeys(notes);
		driver.findElement(By.id("sysverb_update_bottom")).click();
		WebElement search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search2.sendKeys(incidentNum,Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();
		WebElement verifyState=driver.findElement(By.id("incident.state"));
		Select afterSelect=new Select(verifyState);
		String finalState=afterSelect.getFirstSelectedOption().getText();
		if(finalState.equals("Resolved"))
			System.out.println("State is updated to Resolved successfully");
		else 
			System.out.println("State is not changed");
	}
	
	@DataProvider(name="dataForResolve")
	public String[][] sendData() throws IOException
	{
		ReadExcel re= new ReadExcel();
		String[][] data=re.readData("ResolveIncident");
		return data;
	}


}
