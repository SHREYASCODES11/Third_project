package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Booking  extends Home{
	By appointmentpg = By.xpath("//h2[text()='Make Appointment']");
	By scroll = By.xpath("//a[@id='to-top']");
	By facility = By.xpath("//select[@id='combo_facility']");
	By Fac2 = By.xpath("//option[@value='Hongkong CURA Healthcare Center']");
	By check1 = By.xpath("//label[@class='checkbox-inline']");
	By check2 = By.xpath("//input[@id='radio_program_medicare']");
	By date = By.xpath("//input[@id='txt_visit_date']");
	By comment = By.xpath("//textarea[@id='txt_comment']");
	By book = By.xpath("//button[@id='btn-book-appointment']");
	By confirm = By.xpath("//h2[text()='Appointment Confirmation']");
	By go_to = By.xpath("//a[text()='Go to Homepage']");
	By threedot = By.xpath("//a[@id='menu-toggle']");
	By history = By.xpath("//a[text()='History']");
	By vrfy_history = By.xpath("//h2[text()='History']");

	public String appointmenet_page() {
		return driver.findElement(appointmentpg).getText();
	}
	public void scroll_up() {
		driver.findElement(scroll).click();
	}
	public void select_facility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fac = driver.findElement(facility);
		fac.click();
		Select s = new Select(fac);
		s.selectByValue("Hongkong CURA Healthcare Center");
	}
	public void checkbox1() {
		WebElement d =	driver.findElement(check1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",d);
	}
	public void checkbox2() {
		driver.findElement(check2).click();
	}
	public void enter_date() {
		driver.findElement(date).sendKeys("11/11/2023");
	}
	public void add_comment() {
		driver.findElement(comment).click();
		driver.findElement(comment).sendKeys("xyz");
	}
	public void book_appointment() {
		driver.findElement(book).click();
	}
	public String confirmation() {
		return driver.findElement(confirm).getText();
	}
	public void go_to_home() {
		driver.findElement(go_to).click();
	}
	public void click_dot() {
		driver.findElement(threedot).click();
	}
	public void click_history() {
		driver.findElement(history).click();
	}
	public String verify_history() {
		return driver.findElement(vrfy_history).getText();
	}
}
