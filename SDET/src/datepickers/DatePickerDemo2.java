package datepickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver",
				"C:/Users/Fboahene.UNCLEBUCK/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		Thread.sleep(2000);
		
		//String text=driver.findElement(By.xpath("//caption")).getText();
		//System.out.println(text);
		
		String month="Jul 2020";
		String exp_date="20";
		
		while(true)
		{
			String text=driver.findElement(By.xpath("//caption")).getText();
			                                        
			if(text.equals(month)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/button[2]")).click();
			}	
			
		    }
			
			List <WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'tabs-container col')]//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
			
			for(WebElement ele:allDates) 
			{
				String date_text=ele.getText();
				String date[]=date_text.split("\n");
				
				if(date[1].equals(exp_date)) 
				{
					ele.click();
					break;
				}
			}
		}                             
		
	}
	

