package com.company.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractionDemo {

	WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionDemo ad = new AbstractionDemo();
		ad.login();
		ad.logout();
		
	}

	public void login() {

		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		timeout();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	

	public void logout() {
		
		timeout();
		driver.findElement(By.className("oxd-userdropdown")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	
	@SuppressWarnings("deprecation")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}
