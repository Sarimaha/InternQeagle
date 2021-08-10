package com.changemanagement.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessChangeRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String changeReq="CHG0030496";
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
		
		WebElement state=driver.findElement(By.id("change_request.state"));
		Select selectstate=new Select(state);
		selectstate.selectByVisibleText("Assess");
		
		driver.findElement(By.id("lookup.change_request.assignment_group")).click();
		
		Set<String> handles1=driver.getWindowHandles();
		//System.out.println(handles1);
		List<String> listHandle1=new ArrayList<String>(handles1);
		//String parentWindow=listHandle1.get(0);
		//String assignGroupWindow=listHandle1.get(1);
		driver.switchTo().window(listHandle1.get(1));
		
		//driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input")).sendKeys("Software",Keys.ENTER);         
		driver.findElement(By.xpath("//a[text()='Software']")).click();
		driver.switchTo().window(listHandle1.get(0));
		driver.switchTo().frame("gsft_main");

		driver.findElement(By.id("lookup.change_request.assigned_to")).click();

		Set<String> handles2=driver.getWindowHandles();
		//System.out.println(handles2);
		List<String> listHandle2=new ArrayList<String>(handles2);
	//	String assignToWindow=listHandle2.get(1);
		driver.switchTo().window(listHandle2.get(1));

	
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys("ITIL User",Keys.ENTER);
		
		driver.findElement(By.linkText("ITIL User"));

		//driver.switchTo().window(newWindow);
		driver.findElement(By.xpath("//a[text()='ITIL User']")).click();
		driver.switchTo().window(listHandle1.get(0));
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.id("sysverb_update_bottom")).click();
		
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the"
				+ " search.']/following::input")).sendKeys(changeReq,Keys.ENTER);
		
		//String verifyText=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
	//	System.out.println(verifyText);
		
		String finalState=driver.findElement(By.xpath("(//a[@class='linked formlink']/following::td)[3]")).getText();
		if(finalState.equals("Assess"))
			System.out.println("State is updated to Assess succcessfully");
		else
			System.out.println("State is not updated");
	}

}
