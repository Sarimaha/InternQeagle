package com.incident.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WithoutFillingDetails extends BaseClass {
	@Test
	public void Negative()
	{

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
