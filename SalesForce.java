import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		String boardName="Saritha_Work";
		String description="Testing";
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("nupela@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Service Console']")).click();

		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[7]")).click();

		String closed=driver.findElement(By.xpath("//span[text()='Closed']/following-sibling::span")).getText();
		String cls=closed.replaceAll("[\\D]","");
		int closedFinal=Integer.parseInt(cls);

		String open=driver.findElement(By.xpath("//span[text()='Open (>70%)']/following-sibling::span")).getText();
		String opn=open.replaceAll("[\\D]","");
		int openFinal=Integer.parseInt(opn);

		int total=closedFinal+openFinal;
		System.out.println(total);

		System.out.println("Addition of closed and open is :"+total);

		driver.findElement(By.xpath("//button[@title='Edit Goal']")).click();
		WebElement edit=driver.findElement(By.xpath("//span[@id='currencyCode']/following-sibling::input"));
		edit.clear();
		edit.sendKeys("10,000");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		String goalText=driver.findElement(By.xpath("//span[text()='Goal']/following-sibling::span")).getText();
		String repGoal=goalText.replaceAll("[\\D]","");
		int goalFinal=Integer.parseInt(repGoal);

		if(goalFinal==10000)
		{
			System.out.println("Goal is set to 10000 successfully");
		}
		else
		{
			System.out.println("Goal is not set to 10000 successfully");
		}

		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboards']")).click();

		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		WebElement frame2=driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(frame2);		
		driver.findElement(By.id("dashboardNameInput")).sendKeys(boardName);
		driver.findElement(By.id("dashboardDescriptionInput")).sendKeys(description);
		driver.findElement(By.id("submitBtn")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@class='slds-button doneEditing']")).click();

		String getName=driver.findElement(By.xpath("//span[text()='Dashboard']/following-sibling::span")).getText();
		if(boardName==getName)
		{System.out.println("Dashboard "+getName+" is created successfully with description as "+description);
		}

		else {
			System.out.println("Dashboard is not created");
		}
		driver.findElement(By.xpath("(//button[text()='Subscribe'])[2]")).click();

		//driver.switchTo().frame("2");	
		driver.findElement(By.xpath("//span[text()='Daily']")).click();

		WebElement time=driver.findElement(By.id("time"));
		Select select=new Select(time);
		select.selectByVisibleText("10:00 AM");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.switchTo().defaultContent();

		String subscription=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(subscription);

		driver.findElement(By.xpath("(//a[@title='Saritha_Workout']/following-sibling::div[2])[2]")).click();
	
	
	
	
	}
}
/*nupela@testleaf.com India@123
 * Login to https://login.salesforce.com 
 * 2. Click on toggle menu button from the left corner
 *  3. Click view All 
 *  4. Click Service Console from App Launcher 
 *  5. Select Home from the DropDown 
 *  6. Add CLOSED + OPEN values and result should set as the GOAL (If the result is less than 10000 then set the goal as 10000) 
 *  7. Select Dashboards from DropDown 
 *  8. Click on New Dashboard 
 *  9. Enter the Dashboard name as "YourName_Workout" 
 *  10. Enter Description as Testing and Click on Create
 *   11. Click on Done 
 *   12. Verify the Dashboard is Created 
 *   13. Click on Subscribe 
 *   14. Select Frequency as "Daily" 
 *   15. Time as 10:00 AM 
 *   16. Click on Save 
 *   17. Verify "You started Dashboard Subscription" message displayed or not 
 *   18. Close the "YourName_Workout" tab 
 *   19. Click on Private Dashboards 
 *   20. Verify the newly created Dashboard available 
 *   21. Click on dropdown for the item 
 *   22. Select Delete 
 *   23. Confirm the Delete 
 *   24. Verify the item is not available under Private Dashboard folder
 * */


