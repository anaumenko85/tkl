package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUser extends login {
  private static WebDriver driver;
	public static void testAddUser() throws InterruptedException{
    driver.wait(10000);
	driver.findElement(By.linkText("System")).click();
	driver.findElement(By.linkText("Add User")).click();
	driver.findElement(By.id("user.UserName")).clear();
	driver.findElement(By.id("user.UserName")).sendKeys("test");
	driver.findElement(By.id("user.Password")).clear();
	driver.findElement(By.id("user.Password")).sendKeys("123456");
	driver.findElement(By.id("user.FirstName")).clear();
	driver.findElement(By.id("user.FirstName")).sendKeys("Test1");
	driver.findElement(By.id("user.FirstName")).clear();
	driver.findElement(By.id("user.FirstName")).sendKeys("Test");
	driver.findElement(By.id("user.LastName")).clear();
	driver.findElement(By.id("user.LastName")).sendKeys("Last");
	driver.findElement(By.id("user.Email")).clear();
	driver.findElement(By.id("user.Email")).sendKeys("test@test.ua");
	driver.findElement(By.id("user.PhoneNumber_int")).clear();
	driver.findElement(By.id("user.PhoneNumber_int")).sendKeys("123-123-4523");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
	driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
	}

}
