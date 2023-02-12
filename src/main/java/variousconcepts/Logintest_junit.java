package variousconcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest_junit {
	 WebDriver driver;

	 @Before
	public  void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
	}
	@Test
	public  void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
	}
	//@Test
	public  void neglogintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc1234");
		
		driver.findElement(By.name("login")).click();
		
	}
	@After
	public  void teardown() {
		driver.close();
	}
}
