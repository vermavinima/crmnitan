package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

       public class MyloginTest {
    	   
      static   WebDriver driver;

        public static void main(String[] args) {
        	init();
        	loginTest();
        	tearDown();
        	
        	init();
        	negloginTest();
        	tearDown();
        }
		
		
	public static void init() {	
		//set system property
	    System.setProperty("webdriver.chrome.driver", "//Users//Select//eclipse-workspace//2023_Sillenium//crmnitan//driver//chromedriver");
		//object to evoke browser
	    driver = new ChromeDriver();
		//delete cookies
		driver.manage().deleteAllCookies();
		//go to website
	    driver.get("https://techfios.com/billing/?ng=admin/");
	    //maximize window
	    driver.manage().window().maximize();
	    
	}
	
	public static void loginTest() {
		  //insert username
	    driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	    //insert password
	    driver.findElement(By.id("password")).sendKeys("abc123");
	    //click sign in button
	    driver.findElement(By.name("login")).click();
	    
	}
	
	    public static void negloginTest() {
			  //insert username
		    driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		    //insert password
		    driver.findElement(By.id("password")).sendKeys("abc12345");
		    //click sign in button
		    driver.findElement(By.name("login")).click();
		    
	    
	    
	}
	   public  static void tearDown() {
		//close the browser
		 driver.close();
		
	}
	
	
	

}
