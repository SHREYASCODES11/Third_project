package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.Newbase;

public class Recruitment extends Newbase {
	By Recruitment = By.xpath("//*[text()='Recruitment']");

	By JobTitle_select = By.xpath("(//*[text()='-- Select --'])[1]");
	By vacancy= By.xpath("(//*[@class='oxd-select-wrapper'])[2]");	 
	By hiring_manager = By.xpath("(//div[@class='oxd-select-wrapper'])[3]");
	By status = By.xpath("(//div[@class='oxd-select-wrapper'])[4]");
	By cname = By.xpath("//input[@placeholder='Type for hints...']");
	By hint = By.xpath("//input[@placeholder='Enter comma seperated words...']");

	By from = By.xpath("//*[@placeholder='From']");
	By to = By.xpath("//*[@placeholder='To']");

	By method_of_appl =By .xpath("(//div[@class='oxd-select-text-input'])[5]");
	By submit = By.xpath("//button[@type='submit']");

	By select_del = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	By delete = By.xpath("//button[text()=' Delete Selected ']");
	By del_cancel = By.xpath("//button[text()=' No, Cancel ']");

	By vacancies = By.xpath("//a[text()='Vacancies']");
	By vacancies_jobtitle = By.xpath("//div[@class='oxd-select-wrapper'][1]");
	By vacancies_vacancy = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
	By vacancies_hiring =By.xpath("(//div[@class='oxd-select-wrapper'])[3]");
	By vacancies_status = By.xpath("(//div[@class='oxd-select-wrapper'])[4]");
	By vacancies_reset = By.xpath("//button[text()=\" Reset \"]");
	By Vacancies_checkbox =By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	By vacancies_submit = By.xpath("//button[@type='submit']");
	By Help_btn = By.xpath("//i[@class='oxd-icon bi-question-lg']");

	public boolean clickRecruitment(){

		driver.findElement(Recruitment).click();
		return driver.findElement(Recruitment).isDisplayed();

	}

	public boolean jobtitle(){
		driver.findElement(JobTitle_select).click();
		return driver.findElement(JobTitle_select).isEnabled();
	}

	public boolean vacancy(){
		driver.findElement(vacancy).click();
		return driver.findElement(vacancy).isEnabled();
	}

	public boolean hiring(){
		driver.findElement(hiring_manager).click();
		return driver.findElement(hiring_manager).isEnabled();
	}

	public boolean status(){
		driver.findElement(status).click();
		return driver.findElement(status).isEnabled();
	}

	public void name(String name){
		driver.findElement(cname).sendKeys("name");
	}

	public void hint(String hint1){
		driver.findElement(hint).sendKeys("hint1");
	}

	public void dates(String ele,String ele1) {
		driver.findElement(from).sendKeys(ele);
		driver.findElement(from).click();
		driver.findElement(to).sendKeys(ele1);
		driver.findElement(to).click();
		driver.findElement(to).click();
		driver.findElement(submit).click();
	}

	public boolean mof(){
		driver.findElement(method_of_appl).click();
		return driver.findElement(method_of_appl).isEnabled();
	}

	public void submitclick() {
		driver.findElement(submit).click();
	}

	public void bulkdelete() {
		//		JavascriptExecutor js = (JavascriptExecutor)driver;
		//		WebElement scroll = driver.findElement(By.xpath("//div[@class='oxd-layout-context']"));
		//		js.executeScript("window.scrollBy(0,500);");
		driver.findElement(select_del).click();
		driver.findElement(delete).click();
		driver.findElement(del_cancel).click();
	}

	public void vacancies_tab() {
		driver.findElement(vacancies).click();
	}

	public boolean vac_job_title(){
		driver.findElement(vacancies_jobtitle).click();
		return driver .findElement(vacancies_jobtitle).isEnabled();
	}

	public boolean vac_vacancy() {
		driver.findElement(vacancies_vacancy).click();
		return driver.findElement(vacancies_vacancy).isEnabled();
	}

	public boolean vac_hiring() {
		driver.findElement(vacancies_hiring).click();
		return driver.findElement(vacancies_hiring).isEnabled();
	}

	public boolean vac_status() {
		driver.findElement(vacancies_status).click();
		return	driver.findElement(vacancies_status).isEnabled();
	}

	public boolean vac_reset() {
		return	driver.findElement(vacancies_reset).isDisplayed();
	}

	public boolean vac_submit() {
		return	driver.findElement(vacancies_submit).isDisplayed();
	}

	public boolean help() {
		driver.findElement(Help_btn).click();
		return driver.findElement(Help_btn).isDisplayed();
	}

	public void closebrowser() {
		driver.quit();
	}

}
