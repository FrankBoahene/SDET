package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver",
				"C:/Users/Fboahene.UNCLEBUCK/Documents/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
		driver.get("file:///C:/SeleniumPractice/table.html");
		
		int rows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println(rows);
		
        int colunms=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		System.out.println(colunms);
		
		for(int i=2;i<=rows;i++) 
		{
			for(int j=1;j<=colunms;j++) 
			{
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+ "  ");		
			} 
			
			System.out.println();
		}
			

	}

}
