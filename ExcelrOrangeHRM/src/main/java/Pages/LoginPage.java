package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Newbase;

public class LoginPage extends Newbase{
	By uname = By.xpath("//*[@name='username']");
	By pswd = By.xpath("//*[@name='password']");
	By loginBtn = By.xpath("//*[@type='submit']");

	public boolean username() {
		driver.findElement(uname).sendKeys(prop.getProperty("username"));
		return	driver.findElement(uname).isDisplayed();
	}
	public boolean password() {
		driver.findElement(pswd).sendKeys(prop.getProperty("password"));
		return driver.findElement(pswd).isDisplayed();
	}
	public void submit() {
		driver.findElement(loginBtn).click();	
	}








}
