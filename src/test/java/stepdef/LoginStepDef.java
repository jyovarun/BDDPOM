package stepdef;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import base.TestBase;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef extends TestBase {
LoginPage loginpage;
HomePage homepage;
@Given("User is already on login page")
public void user_is_already_on_login_page() {
	initialize();
}

//using DataTables as Map
@When("User enters login credentials")
public void user_enters_login_credentials(DataTable userCred) {
	loginpage =new LoginPage();
	List<Map<String, String>> data = userCred.asMaps();
	loginpage.login(data.get(0).get("uname"), data.get(0).get("pwd"));

}
@Then("User is on Home Page")
public void user_is_on_home_page() {
	homepage = new HomePage();
	boolean isValid =  homepage.isUserLoggedIn();
Assert.assertTrue(isValid);
}

@Then("Close browser")
public void close_browser() {
	System.out.println("committed");
   driver.close();
}

}

