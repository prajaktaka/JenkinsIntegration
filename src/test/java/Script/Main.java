package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import Pages.Register;
import Pages.LogIn;
import Pages.Search;


public class Main
{
	WebDriver driver;
	Register register;
	LogIn login;
	Search add;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/");	
			driver.manage().window().maximize();
		
		}
		
		@Test
	    public void Testng() throws InterruptedException 
	    {	
			register=new Register(driver);
			register.Click_On_Register();
			login= new LogIn(driver);
			login.Click_On_Log_In();
			add= new Search(driver);
			add.Click_On_Add();
		}
		
		
}

