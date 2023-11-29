package pages;

import org.openqa.selenium.By;

public class LoginPage extends Home{
	By makeappointment = By.xpath("//a[@id='btn-make-appointment']");
	By threedot = By.xpath("//a[@id='menu-toggle']");
	By login = By.xpath("//a[text()='Login']");
	By verify_log = By.xpath("//p[text()='Please login to make appointment.']");
	By uname = By.xpath("//input[@id='txt-username']");
	By pswd = By.xpath("//input[@id='txt-password']");
	By submit = By.xpath("//button[@id='btn-login']");
	By logout = By.xpath("//a[text()='Logout']");

	public void click_makeappointment() {
		driver.findElement(makeappointment).click();
	}
	public void click_dot() {
		driver.findElement(threedot).click();
	}
	public void click_log() {
		driver.findElement(login).click();
	}
	public String vefy_text() {
		return driver.findElement(verify_log).getText();
	}
	public void user() {
		driver.findElement(uname).sendKeys("John Doe");
	}
	public void password() {
		driver.findElement(pswd).sendKeys("ThisIsNotAPassword");
	}
	public void submit_login() {
		driver.findElement(submit).click();
	}
	public void logout() {
		driver.findElement(logout).click();
	}
}
