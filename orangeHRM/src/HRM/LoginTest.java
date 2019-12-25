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
	
	WebDriver bo;
	String bpath= "http://apps.qaplanet.in/qahrm/login.php";
	
	
	@BeforeMethod
	public void b() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
		bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	    //CrossBrpwser
	/* @Parameters("browser")
		@BeforeMethod
		public void browser(String br) {
		
		 if (br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
			bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  		
			}
		 
			else if(br.equalsIgnoreCase("firefox")){
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\QA3\\Desktop\\prathamesh\\geckodriver.exe");
				bo=new FirefoxDriver();
				bo.get(bpath);
					bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  
					}
	  }*/
	
	
	@AfterMethod
	public void bclose() {
		bo.quit();
	
	}
	
	
	
	  //Valid & Valid
	  @Test(enabled=true, priority=1,groups="main")
	  public void TC1_1() throws InterruptedException {
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(4000);
			Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		
			  }
	  
	  
	  //Invalid & Valid
	  @Test(enabled=true, priority=2,groups="main")
	  void  TC1_2() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1234");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(4000);
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
				
	}
	  
	 
	  //Valid & Invalid
	  @Test(enabled=true, priority=3,groups="main")
	  void  TC1_3() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab123");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	  }
	  
	  
	  //Blank & Valid
	  @Test(enabled=true, priority=4,groups="main")
	  void  TC1_4() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
			bo.switchTo().alert().accept();
	  }
	  
	  
	  //Valid & Blank
	  @Test(enabled=true, priority=5,groups="main")
	  void  TC1_5() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.switchTo().alert().getText(), "Password not given!");
			bo.switchTo().alert().accept();
	  }
	  
	  
	  //Blank & Blank
	  @Test(enabled=true, priority=6,groups="main")
	  void  TC1_6() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
			bo.switchTo().alert().accept();
	  }
	  
	  
	  //Invalid & Invalid
	  @Test(enabled=true, priority=7,groups="main")
	  void  TC1_7() throws InterruptedException{
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("ddff22");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("dccs22");
		  bo.findElement(By.xpath("//input[@name='clear']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//input[@name='txtUserName']")).findElement(By.xpath("//input[@name='txtPassword']")).getText(), "");
	  }
	  
	  
	  
	  @Test(enabled=true, priority=8,groups="main")
	  void  TC1_8() throws InterruptedException{
		  bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
			Thread.sleep(5000);
			bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
			 Set<String> s1=bo.getWindowHandles();
			 Iterator<String> i1=s1.iterator();
			 String mainwindow =i1.next();
			 String ChildWindow=i1.next();
			
			 Assert.assertEquals(bo.switchTo().window(ChildWindow).getTitle(), "HR Management System | HR Management Software | OrangeHRM");	
			
	  }
	  
	  
	  @Test(enabled=true, priority=9,groups="main",dependsOnMethods="TC1_1")
		 void TC1_9() throws InterruptedException{ 
			  
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Thread.sleep(4000);
				bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Thread.sleep(4000);
				Assert.assertEquals(bo.getTitle(), "OrangeHRM - New Level of HR Management");
	  }

	  @Test(enabled=true, priority=10,groups="main",dependsOnMethods="TC1_1")
		 void TC1_10() throws InterruptedException{ 
			 
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Thread.sleep(4000);
				bo.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
				Thread.sleep(4000);
			
				Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  }
	  
	  
	  @Test(enabled=true, priority=11,groups="main",dependsOnMethods="TC1_1")
		 void TC1_11() throws InterruptedException{ 
			 
		  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		  bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Thread.sleep(4000);
				
				Assert.assertEquals(bo.findElement(By.xpath("//li[contains(text(),'Welcome qaplanet1')]")).getText(), "Welcome qaplanet1");
	  }
	  
	  
	}
