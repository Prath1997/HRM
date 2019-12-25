package HRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DummyTest {
	WebDriver bo;
	 String bpath="http://apps.qaplanet.in/qahrm/login.php";
	
	 
	 @Parameters("browser")
		@BeforeMethod
		public void browser(String br) {
		
		 if (br.equalsIgnoreCase("gg")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);	
		bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			}
		 
			else if(br.equalsIgnoreCase("ff")){
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\QA3\\Desktop\\prathamesh\\geckodriver.exe");
				bo=new FirefoxDriver();
				bo.get(bpath);
				bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
					}
	  }
	 
	 @AfterMethod
public void b1(){
		 bo.close();
		 
	 }
	 
	 
  @Test
  public void TC_1() throws InterruptedException {
	  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
  }
}
