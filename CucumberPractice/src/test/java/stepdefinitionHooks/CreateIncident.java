package stepdefinitionHooks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIncident extends BaseClass {

	public String createNum;
	@Given("Load application url")
	public void Load_application_url() {
	    driver.get("https://dev113545.service-now.com/");
	}
	
	@Given("Enter the username {string}")
	public void enter_the_username(String userName) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(userName);
	}

	@Given("Enter the password {string}")
	public void enter_the_password(String password)
	{
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	
	@Given("Click on create_login button")
	public void Click_on_create_login_button(){
		driver.findElement(By.id("sysverb_login")).click();
	}
	
	@Given("Enter Incident in filter navigator and press enter")
	public void enter_incident_in_filter_navigator_and_press_enter() {
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
	}

	@Given("Click on Create new option and fill the manadatory fields")
	public void click_on_create_new_option_and_fill_the_manadatory_fields() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		createNum=driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Newly generated Incident Number is : "+createNum);
		driver.findElement(By.id("incident.short_description")).sendKeys("Entering short description");
	}

	@When("Click Submit button")
	public void click_submit_button() {
		driver.findElement(By.id("sysverb_insert_bottom")).click();
	}

	@Then("Verify the newly created incident")
	public void verify_the_newly_created_incident() {
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(createNum,Keys.ENTER);
		String searchNum=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println("Incident number used to search is : "+searchNum);
		if(createNum.equals(searchNum))
			System.out.println("Incident number is created successfully");
		else
			System.out.println("There is no match found for the created Incident number");
	}
}






