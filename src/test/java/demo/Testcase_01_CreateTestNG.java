package demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Testcase_01_CreateTestNG {
	
	@Test
	public void testLogin() {
		System.out.println("Test Login");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testLogout() {
		System.out.println("Test Logout");
	}
	
	@Test
	public void testUserDisplay() {
		System.out.println("Test user display");
	}
	
	

}

