package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
//WebElement username=driver.findElement(By.name("email"));
//username.sendKeys("jyotsnatejaswi7@gmail.com");
	@FindBy(name="email")
	WebElement uname;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	@FindBy(linkText="Forgot your password?")
	WebElement forgotLink;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void login(String strName, String strPwd) {
		uname.sendKeys(strName);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	public void forgotPwd() {
	forgotLink.click();
	}
}
