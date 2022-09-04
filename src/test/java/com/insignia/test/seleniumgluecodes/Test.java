package com.insignia.test.seleniumgluecodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
    WebDriver driver;
    @Given("user is on homepage")
    public void user_is_on_homepage() throws Throwable {     
    	WebDriverManager.chromedriver().browserVersion("77.0.3865.40").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("input the url here"); 
    }
    
    @When("user navigates to Login Page")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.id("input id for click able button here")).click(); // if want to change not by id, you can choose by name or other
    }
    
    @When("user enters username and Password")
    public void user_enters_username_and_Password() throws Throwable {
    	driver.findElement(By.id("email")).sendKeys("test@mail.com"); // put valid / invalid username here
        driver.findElement(By.id("passwd")).sendKeys("test@123"); // put valid / invalid password here
        driver.findElement(By.id("captcha")).click();;
        driver.findElement(By.id("SubmitLogin")).click();   
    }
    
    @When("user submit username and Password multiple times")
    public void user_submit_username_and_Password_multiple_times() throws Throwable {
    	int count = 3; // how much to repeated
    	for (int i = 0; i < count; i++) {
        	driver.findElement(By.id("email")).sendKeys("test@mail.com"); // put valid / invalid username here
            driver.findElement(By.id("passwd")).sendKeys("test@123"); // put valid / invalid password here
            driver.findElement(By.id("captcha")).click();;
            driver.findElement(By.id("SubmitLogin")).click(); 
		}
    }
    
    @When("user sort all query by Query name")
    public void user_sort_all_query_by_Query_name() throws Throwable {
        driver.findElement(By.cssSelector("put css locator here")).click(); // if want to change locator not by CSS, you can choose by name or other
    }
    
    @When("user move to the next page")
    public void user_move_to_the_next_page() throws Throwable {
        driver.findElement(By.cssSelector("put css locator here")).click(); // if want to change locator not by CSS, you can choose by name or other
    }
    
    @Then("database is sorted")
    public void database_is_sorted() throws Throwable {
    	String actual = driver.findElement(By.id("element for get 1st element name")).getText();
    	Assert.assertEquals(actual.toLowerCase().charAt(0), "z"); // for assert the result success/not
        driver.quit();  
    }
    
    @Then("The page is move to the next page")
    public void The_page_is_move_to_the_next_page() throws Throwable {
    	Assert.assertTrue(!driver.findElement(By.id("element for get 1st element name")).isEnabled()); // for assert the result success/not
        driver.quit();  
    }
    
    @Then("success message is displayed")
    public void success_message_is_displayed() throws Throwable {
    	String exp_message = "example expected result";
    	String actual = driver.findElement(By.id("element for get message")).getText();
        Assert.assertEquals(exp_message, actual); // for assert the result success/not
        driver.quit();  
    }
    
    @Then("failed message is displayed")
    public void failed_message_is_displayed() throws Throwable {
    	String exp_message = "example expected result";
    	String actual = driver.findElement(By.id("element for get message")).getText();
        Assert.assertEquals(exp_message, actual); // for assert the result success/not
        driver.quit();  
    }   
}
