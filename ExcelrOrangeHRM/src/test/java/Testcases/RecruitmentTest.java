package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.Recruitment;

public class RecruitmentTest extends LoginPage {
	Recruitment rp;
	LoginPage lp;
	@Test(priority = 0)
	public void tc1() {
		rp = new Recruitment();

		boolean R = rp.clickRecruitment();
		Assert.assertEquals(R, true);
		System.out.println("Reccruitment module is clickable");
	}
	@Test(priority = 1)
	public void tc2() {
		boolean	 A = rp.jobtitle();
		Assert.assertEquals(A, true);
		System.out.println("jobtitle is clickable");
	}

	@Test(priority = 2)
	public void tc3() {
		boolean	 B = rp.vacancy();
		Assert.assertEquals(B, true);
		System.out.println("vacancy is clickable");
	}
	@Test(priority = 3)
	public void tc4() {
		boolean C = rp.hiring();
		Assert.assertEquals(C, true);
		System.out.println("Hiring_man is clickable");
	}
	@Test(priority = 4)
	public void tc5() {
		boolean D = rp.status();
		Assert.assertEquals(D, true);
		System.out.println("Status is clickable");
	}
	@Test(priority = 5)
	public void tc6() {
		rp.name("adam");
	}
	@Test(priority = 6)
	public void tc7() {
		rp.hint("job");
	}
	@Test(priority = 7)
	public void tc8() {
		rp.dates("2021-11-09", "2023-05-16");
	}
	@Test(priority = 8)
	public void tc9() {
		boolean E = rp.mof();
		Assert.assertEquals(E, true);
		System.out.println("Method of application is clickable");		 
	}
	@Test(priority = 9)
	public void tc10() {
		rp.submitclick();
	}
	@Test(priority = 10)
	public void tc11() {
		rp.bulkdelete();	
		System.out.println("All the checkbox is selected");
	}
	@Test(priority = 11)
	public void tc12() {
		rp.vacancies_tab();
	}

	@Test(priority = 12)
	public void tc13() {
		boolean	 F= rp.vac_job_title();
		Assert.assertEquals(F, true);
		System.out.println("vacancies job title is clickable");
	}
	@Test(priority = 13)
	public void tc14() {
		boolean G = rp.vac_hiring();
		Assert.assertEquals(G, true);
		System.out.println("vacancies hiring_man is clickable");
	}
	@Test(priority = 14)
	public void tc15() {
		boolean H = rp.vac_status();
		Assert.assertEquals(H, true);
		System.out.println("Vacancies status is clickable");
	}
	@Test(priority = 15)
	public void tc16() {
		boolean I =rp.vac_reset();
		Assert.assertEquals(I, true);
		System.out.println("Reset button is displyed");
	}
	@Test(priority = 16)
	public void tc17() {
		boolean J =rp.vac_submit();
		Assert.assertEquals(J, true);
		System.out.println("Subnit button is displyed");
	}
	@Test(priority = 17)
	public void tc18() {
		boolean K =rp.help();
		Assert.assertEquals(K, true);
		System.out.println("Help button is displayed");
	}
	@Test(priority = 18)
	public void tc19() {
		rp.closebrowser();
	}

}

