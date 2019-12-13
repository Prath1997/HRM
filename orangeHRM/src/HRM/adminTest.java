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

public class adminTest {
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
	
	
// admin=company info=genral
  @Test(enabled=true, priority=1,groups="admin")
	 void TC2_1() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
	  
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'General')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'General')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }
	  
//admin=company info=location
  @Test(enabled=true, priority=2,groups="admin")
	 void TC2_2() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		 
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Locations')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Locations')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }
  
//admin=company info=company structure
  @Test(enabled=true, priority=3,groups="admin")
	 void TC2_3() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Structure')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Company Structure')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }

//admin=company info=company property
  @Test(enabled=true, priority=4,groups="admin")
	 void TC2_4() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Property')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Company Property')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }
  
 //admin=job=jobs times
  @Test(enabled=true, priority=5,groups="admin")
	 void TC2_5() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }
//admin=job=job specification
  @Test(enabled=true, priority=6,groups="admin")
	 void TC2_6() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Job Specifications')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Job Specifications')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  
	  }
  
  
//admin=job=pay grades
  @Test(enabled=true, priority=7,groups="admin")
	 void TC2_7() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Pay Grades')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Pay Grades')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }
  
  
//admin=job=emplyoment status
  @Test(enabled=true, priority=8,groups="admin")
	 void TC2_8() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }
  
//admin=job=EEO jobs
  @Test(enabled=true, priority=9,groups="admin")
	 void TC2_9() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'EEO Job Categories')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'EEO Job Categories')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }
  
  
//admin = qualification= educations
	  @Test(enabled=true, priority=10,groups="admin")
		 void TC2_10() throws InterruptedException{ 
		  Actions acr=new Actions(bo);
			
			acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			Thread.sleep(2000);
			acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Qualification')]"))).perform();
			Thread.sleep(2000);
			acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Education')]"))).perform();
			
			bo.findElement(By.xpath("//span[contains(text(),'Education')]")).click();
			Thread.sleep(2000);
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		
		bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		  }

//admin = qualification= licenses
  @Test(enabled=true, priority=11,groups="admin")
	 void TC2_11() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Qualification')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Licenses')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Licenses')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }
  
  
//admin =skills = skills
  @Test(enabled=true, priority=12,groups="admin")
	 void TC2_12() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent skills']//span[contains(text(),'Skills')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='skills']//span[contains(text(),'Skills')]"))).perform();
		
		bo.findElement(By.xpath("//a[@class='skills']//span[contains(text(),'Skills')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }

  
 //admin =skills = languages
  @Test(enabled=true, priority=13,groups="admin")
	 void TC2_13() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent skills']//span[contains(text(),'Skills')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Languages')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Languages')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }

//admin = memberships = memberships type
  @Test(enabled=true, priority=14,groups="admin")
	 void TC2_14() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent memberships']//span[contains(text(),'Memberships')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Membership Types')]"))).perform();
		
		bo.findElement(By.xpath("//span[contains(text(),'Membership Types')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }

//admin = memberships = membership
  @Test(enabled=true, priority=15,groups="admin")
	 void TC2_15() throws InterruptedException{ 
	  Actions acr=new Actions(bo);
		
		acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent memberships']//span[contains(text(),'Memberships')]"))).perform();
		Thread.sleep(2000);
		acr.moveToElement(bo.findElement(By.xpath("//a[@class='memberships']//span[contains(text(),'Memberships')]"))).perform();
		
		bo.findElement(By.xpath("//a[@class='memberships']//span[contains(text(),'Memberships')]")).click();
		Thread.sleep(2000);
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	
	bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	  }

  
}
