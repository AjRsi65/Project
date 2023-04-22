package Stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.SigninPage;

public class SigninPagetestcase {

	
	WebDriver driver;
	
	SigninPage obj = new SigninPage();
	
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
	   obj.launchApplication();
	   
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password()  {
	    obj.enterUserName("singareajinkya71@gmail.com");
	    obj.enterPassword("Ajinkya@1774");
	  
	}

	@When("click on signin button")
	public void click_on_signin_button() {
	    obj.clickButton();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
	    obj.closeBrowser();
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password(){
	    obj.enterUserName("singareajinkya71@gmail.com");
	    obj.enterPassword("Ajinkya@123");
	    
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	  
	}
}
