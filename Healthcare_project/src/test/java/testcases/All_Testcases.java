package testcases;

import org.testng.annotations.Test;
import pages.Booking;
import pages.Home;
import pages.LoginPage;

public class All_Testcases extends Home {

	Home hm;
	Booking b;
	LoginPage lp;

	@Test
	public void Tc1() {
		hm = new Home();
		hm.initialization();
	}
	@Test
	public void Tc2() {
		lp = new LoginPage();
		lp.click_makeappointment();
		String d = lp.vefy_text();
		System.out.println("verifying login page : "+d);
		lp.user();
		lp.password();
		lp.submit_login();
	}
	@Test
	public void Tc3() {
		b = new Booking();
		String h = b.appointmenet_page();
		System.out.println("verifying : "+h);
		b.select_facility();
		b.checkbox1();
		b.checkbox2();
		b.enter_date();
		b.add_comment();
		b.book_appointment();
	}
	@Test
	public void Tc4() {
		b = new Booking();
		String a = b.confirmation();
		System.out.println("confirmation : "+a);
		b.go_to_home();
	}
	@Test
	public void Tc5() {
		b = new Booking();
		b.click_dot();
		b.click_history();
		String c = b.verify_history();
		System.out.println("verifying : "+c);
		b.go_to_home();
	}
	@Test
	public void Tc6() {
		lp = new LoginPage();
		lp.click_dot();
		lp.logout();
	}
	@Test
	public void Tc7() {
		hm.close_browser();
	}
}
