package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest_Junit {

	WebDriver driver;
	@BeforeClass
	 static public void beforeClass(){
		System.out.println("before class");
	}
	@AfterClass
	static public void afterClass() {
		System.out.println("after class");
		
		 
	}
@Before

	public void init() {
	System.out.println("before");
		System.setProperty("webdriver.chrome.driver",
				"//Users//Select//eclipse-workspace//2023_Sillenium//crmnitan//driver//chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
 @Test
	public void loginTest() {
	 System.out.println("test1");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login123")).click();
	}
@Test
	public void negloginTest() {
System.out.println("test2");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password12a")).sendKeys("abc12345");
		driver.findElement(By.name("login")).click();

	}
@After
	public void tearDown() {
	System.out.println("after");
		driver.close();

	}

}
