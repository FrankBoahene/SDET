package recordingTests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCase {

	WebDriver driver;
	
	@BeforeClass
	void setup()

	{
		System.setProperty("Webdriver.chrome.driver",
				"C:/Users/Fboahene.UNCLEBUCK/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		driver =new ChromeDriver();
		driver.get("http://demo.nopcommerce.com");
		driver.manage().window().maximize();
	}	
		
	@Test
	void verifyLinks() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("verifyLinks");
		
		// Computers
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
		System.out.println(driver.getTitle());
		
		// Electronics
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.id("add-to-cart-button-19")).click();
		
		Thread.sleep(2000);
		
		// Apparel
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
		System.out.println(driver.getTitle());
		
		// Digital Downloads
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a")).click();
		System.out.println(driver.getTitle());
		
		// Books
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
		System.out.println(driver.getTitle());
				
		// Jewelry
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
		System.out.println(driver.getTitle());
				
		// Gift Cards
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a")).click();
		System.out.println(driver.getTitle());
		
		ScreenRecorderUtil.stopRecord();
			
	}
	
	@AfterClass
	void tearDown()
	{		
		driver.close();	
	}

}
