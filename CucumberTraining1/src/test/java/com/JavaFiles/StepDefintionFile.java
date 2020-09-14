package com.JavaFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintionFile {
	
	WebDriver driver;
	WebDriverWait wait;

	@Given("^user need to be on Advantageonlineshopping page$")
	public void user_need_to_be_on_Advantageonlineshopping_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://advantageonlineshopping.com/");
		System.out.println("OK");
		driver.manage().window().maximize();
		Thread. sleep(5000);
		driver.findElement(By.id("menuUserSVGPath")).click();
	}
	
	@When("^user enters user \"([^\"]*)\" user name$")
	public void user_enters_user_user_name(String userName)
	{ 
		driver.findElement(By.name("username")).sendKeys(userName);
	}
	
	@Then("^us"
			+ "er checks user \"([^\"]*)\" user name is present$")
	public void user_checks_user_user_name_is_present(String userName) throws InterruptedException
	{
		String userNameActual = driver.findElement(By.name("username")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}	
		
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver = null;
	}
	
}
