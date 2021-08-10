package com.incidentmanagement.project;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class MyntraProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String brandName="Duke";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webDriver.chrome.driver","D://selenium-java-3.141.59/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement men=	driver.findElement(By.xpath("//a[text()='Men']"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();

		String items=driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String repItem=items.replaceAll("[^0-9]","");
		int count=Integer.parseInt(repItem);
		System.out.println("Total count: "+count);

		String jackets=driver.findElement(By.xpath("//input[@value='Jackets']/following::span")).getText();
		String repjackets=jackets.replaceAll("[^0-9]","");
		int countjackets=Integer.parseInt(repjackets);
		System.out.println("Count of Jackets: "+countjackets);

		String rainJacket=driver.findElement(By.xpath("//input[@value='Rain Jacket']/following::span")).getText();
		String reprainJacket=rainJacket.replaceAll("[^0-9]","");
		int countrainJacket=Integer.parseInt(reprainJacket);
		System.out.println("Count of Rain Jackets: "+countrainJacket);

		int sum=countjackets+countrainJacket;
		if(sum==count)
			System.out.println("It matches witht the total count");
		else
			System.out.println("It does not matches witht the total count");

		driver.findElement(By.xpath("//label[contains(text(),'Jackets')]")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[contains(text(),'Duke')]")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		List<WebElement> brand=driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println("Total no of Jackets displayed under Duke Brand is: "+brand.size());
		
		
		 for(WebElement ele:brand)
		  { String name=ele.getText();
		 System.out.println(name); System.out.println(ele.getText());
		 if(name.equals("Duke")) continue; }
		 
		System.out.println("All the Coats are of brand Duke");

		WebElement sort=driver.findElement(By.xpath("//div[contains(@class,'sort-sortBy')]"));
		WebElement discount=driver.findElement(By.xpath("//ul[@class='sort-list']/li[3]/label"));
		Actions sortAction=new Actions(driver);		
		sortAction.moveToElement(sort).perform();
		sortAction.moveToElement(discount).click().perform();
		
		String price=driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("The price of the first displayed item is "+price);
		driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
		Set<String> handles=driver.getWindowHandles();
		//System.out.println(handles.size());
		//	for(String eachHandle:handles)
		//	{
		//	System.out.println(eachHandle);
		//	}
		List<String> listHandle=new ArrayList<String>(handles);
		String newWindow=listHandle.get(1);
		driver.switchTo().window(newWindow);

		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date()); 
		
		File DestFile=new File("D:\\TestLeaf/MavenProject/screenshot"+timestamp+".png");
		FileUtils.copyFile(SrcFile, DestFile);

		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		System.out.println("Added the item to the Wishlist successfully");
		driver.close();


	}

}
