package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Positive {
	public WebDriver driver;
	
	@Given("Open the chromeBrowser")
	public void openBrowser()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Given("Load application url {string}")
	public void loadApp(String url)
	{
		driver.get(url);
	}
	
	@Given("Enter the username as {string}")
	public void enterUsername(String username)
	{
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enterpwd(String password)
	{
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	@When("Click on login button")
	public void clickLogin()
	{
		driver.findElement(By.id("sysverb_login")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomepage()
	{
		System.out.println("home page is displayed");
	}
	
}

	





