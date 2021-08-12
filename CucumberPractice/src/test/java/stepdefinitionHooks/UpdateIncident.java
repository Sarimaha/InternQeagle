package stepdefinitionHooks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateIncident extends BaseClass{
	
	@Given("Load update_application url")
	public void load_update_application_url() {
		 driver.get("https://dev113545.service-now.com/");
	}

	@Given("Enter the update_username {string}")
	public void enter_the_update_username(String userName) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(userName);
	}

	@Given("Enter the update_password {string}")
	public void enter_the_update_password(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}

	@Given("Click on update_login button")
	public void click_on_update_login_button() {
		driver.findElement(By.id("sysverb_login")).click();
	}

	@Given("Enter update_Incident in filter navigator and press enter")
	public void enter_update_incident_in_filter_navigator_and_press_enter() {
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and ./text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
	}

	@Given("Search for the existing incident {string} and click on the incident")
	public void search_for_the_existing_incident_and_click_on_the_incident(String incidentNumber) {
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(incidentNumber,Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(@class,'linked formlink')]")).click();
	}

	@Given("Update the incidents with Urgency {string} as High")
	public void update_the_incidents_with_urgency_as_high(String urgencyValue) {
		WebElement urgency=driver.findElement(By.id("incident.urgency"));
		Select urgencySelect=new Select(urgency);
		urgencySelect.selectByVisibleText(urgencyValue);
	    
	}

	@Given("Update the incident with State {string} as In Progress")
	public void update_the_incident_with_state_as_in_progress(String stateValue) {
		WebElement state=driver.findElement(By.id("incident.state"));
		Select stateSelect=new Select(state);
		stateSelect.selectByVisibleText(stateValue);
	}

	@When("Click on Update button")
	public void click_on_update_button() {
		driver.findElement(By.id("sysverb_update_bottom")).click();
	}

	@Then("Verify the priority and state")
	public void verify_the_priority_and_state() {
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
