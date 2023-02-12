package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		

		 init();
		 logintest();
		 teardown();
		
		
		
		
		
	}
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("https://techfios.com/test/billing/?ng=admin/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	public static void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
	}
	
////	public static void neglogintest() {
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		
//		driver.findElement(By.id("password")).sendKeys("abc1234");
//		
//		driver.findElement(By.name("login")).click();
//		
//	}
	
	public static void teardown() {
		driver.close();
	
		
	}
}
