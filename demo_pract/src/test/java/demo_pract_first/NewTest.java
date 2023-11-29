package demo_pract_first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver d = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)d;

	@Test(groups= {"smoke"})
	public void f() {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement e =   d.findElement(By.xpath("//h5[text()='Forms']//parent::div[@class='card-body']"));
		js.executeScript("arguments[0].click();",e);
		d.manage().window().maximize();
		d.findElement(By.xpath("//span[text()='Practice Form']")).click();
	}
	@Test(groups= {"regression "})
	public void fillingform() throws InterruptedException {
		d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("divya");
		d.findElement(By.xpath("//input[@id='lastName']")).sendKeys("patil");
	}
  @BeforeSuite
  public void beforeSuite() {
	  d.get("https://demoqa.com/");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
