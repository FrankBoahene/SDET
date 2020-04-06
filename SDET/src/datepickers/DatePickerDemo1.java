package datepickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1
{

	public static void main(String[] args) throws InterruptedException
	{
		
		String month="May 2020";
		String day="25";
		
		System.setProperty("Webdriver.chrome.driver",
				"C:/Users/Fboahene.UNCLEBUCK/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		Thread.sleep(2000);
		
		while(true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[3]/div[1]/nav/div[2]")).getText();
			                                        
			if(text.equals(month)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[1]//nav[1]//div[3]//*[local-name()='svg']")).click();
			}		
			
			driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div["+day+"]")).click();
			                             
		
		}                             
		
	}
	
}
