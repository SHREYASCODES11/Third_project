package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Newbase;
import Pages.LoginPage;

public class LoginPageTest extends Newbase{
	LoginPage lp;
	@Test()
	public void browsesetup() {
		lp = new LoginPage();
		lp.initialization();
	}
	@Test()
	public void tc1() {
		boolean a = lp.username();
		Assert.assertEquals(a,true);
		System.out.println("Username is displyed and we can write it ");
	}
	@Test()
	public void tc2() {
		boolean b = lp.password();
		Assert.assertEquals(b,true);
		System.out.println("Password is displyed and we can write it");
	}
	@Test()
	public void tc3() {
		lp.submit();
	}

}
