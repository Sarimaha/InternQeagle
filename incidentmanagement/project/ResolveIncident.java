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

public class ResolveIncident {

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
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Open']")).click();
		driver.switchTo().frame("gsft_main");

		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("INC0010799",Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();

		WebElement state=driver.findElement(By.id("incident.state"));
		Select stateSelect=new Select(state);
		stateSelect.selectByVisibleText("Resolved");

		driver.findElement(By.xpath("//span[contains(text(),'Resolution Information')]")).click();

		WebElement resCode=driver.findElement(By.id("incident.close_code"));
		Select resolutionCode=new Select(resCode);
		resolutionCode.selectByVisibleText("Solved (Permanently)");

		driver.findElement(By.id("incident.close_notes")).sendKeys("resolve notes");

		driver.findElement(By.id("sysverb_update_bottom")).click();


		WebElement search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search2.sendKeys("INC0010799",Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(@class,'formlink')]")).click();

		WebElement verifyState=driver.findElement(By.id("incident.state"));
		Select afterSelect=new Select(verifyState);
		String finalState=afterSelect.getFirstSelectedOption().getText();
		if(finalState.equals("Resolved"))
			System.out.println("State is updated to Resolved successfully");
		else 
			System.out.println("State is not changed");
	}

}
