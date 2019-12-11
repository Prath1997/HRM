package HRM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest {
	
	WebDriver ob;
	String bpath= "http://apps.qaplanet.in/qahrm/login.php";
	
	  @Test(enabled=true, priority=1,groups="main")
	  public void TC_1() throws InterruptedException {
		  ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(4000);
			Assert.assertEquals(ob.getTitle(), "OrangeHRM");
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
	  }
	  @Test(enabled=true, priority=2,groups="main")
	  void TC_2() throws InterruptedException{
			ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1234");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(4000);
			Assert.assertEquals(ob.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			
	}
	  @Test(enabled=true, priority=3,groups="main")
	  void TC_3() throws InterruptedException{
			ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab123");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(ob.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  }
	  @Test(enabled=true, priority=4,groups="main")
	  void TC_4() throws InterruptedException{
			ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(ob.switchTo().alert().getText(), "User Name not given!");
			ob.switchTo().alert().accept();
	  }
	  @Test(enabled=true, priority=5,groups="main")
	  void TC_5() throws InterruptedException{
			ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(ob.switchTo().alert().getText(), "Password not given!");
			ob.switchTo().alert().accept();
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  }
	  @Test(enabled=true, priority=6,groups="main")
	  void TC_6() throws InterruptedException{
			ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
			ob.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(ob.switchTo().alert().getText(), "User Name not given!");
			ob.switchTo().alert().accept();
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  }
	  @Test(enabled=true, priority=7,groups="main")
	  void TC_7() throws InterruptedException{
		  ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("ddff22");
			ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("dccs22");
			ob.findElement(By.xpath("//input[@name='clear']")).click();
			Assert.assertEquals(ob.findElement(By.xpath("//input[@name='txtUserName']")).findElement(By.xpath("//input[@name='txtPassword']")).getText(), "");
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  }
	  @Test(enabled=true, priority=8,groups="main")
	  void TC_8() throws InterruptedException{
		  ob.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
			Thread.sleep(5000);
			ob.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    //String windowHandle = ob.getWindowHandle();
			
			 Set<String> s1=ob.getWindowHandles();
			 Iterator<String> i1=s1.iterator();
			 String mainwindow =i1.next();
			 String ChildWindow=i1.next();
			/*while(i1.hasNext()) {
				//  String ChildWindow=i1.next();
				  if(!windowHandle.equalsIgnoreCase(ChildWindow))
				  {
					  ob.switchTo().window(ChildWindow);  */
			 Assert.assertEquals(ob.switchTo().window(ChildWindow).getTitle(), "HR Management System | HR Management Software | OrangeHRM");	
			 //ob.quit();
	  }
	  
	  
	  
		@BeforeMethod
		public void b() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA6\\Downloads\\chromedriver1.exe");
			ob= new ChromeDriver();
			ob.get(bpath);
		}
		@AfterMethod
		public void bclose() {
			ob.quit();
		}
		/*@Parameters("browser")
		@BeforeMethod
		public void browser(String br) {
			if (br.equalsIgnoreCase("gg")) {
				
				ob=new ChromeDriver();
				ob.get(bpath);
				
				
			}
			else if(br.equalsIgnoreCase("ff"))
			{

				ob=new FirefoxDriver();
				ob.get(bpath);
				
			}
		}*/
	}
