package HRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dummyTest {
	WebDriver bo;
	String bpath= "http://apps.qaplanet.in/qahrm/login.php";
	
	@BeforeMethod
	public void b() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
		 bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(2000);
	}
	
	@AfterMethod
	public void bclose() {
		bo.quit();
	}
	
	
	  @Test(enabled=true, priority=00,groups="admin")
		 void TC2_00() throws InterruptedException{ 
		  Actions acr=new Actions(bo);
			
		  }
	
	
	
}
