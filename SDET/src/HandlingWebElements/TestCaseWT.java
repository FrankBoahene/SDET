/* TEST CASE
 * ..............................................
 * 1) Login to Orange HRM
 * 2) Go to Admin ==> User Management ==> Users
 * 3) Count the Employees whose status is Enabled in the WebTable
 * ................................................................. */

package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseWT {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.firefox.marionette",
				"C://Users/Fboahene.UNCLEBUCK/Documents/Selenium/Gecko/geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		
		int rowcount = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		
		int statuscount = 0;
		
		for (int i = 1; i <= rowcount; i++) 
		{
			String status = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[" + i + "]/td[5]")).getText();
					
			if (status.equals("Enabled")) {
				statuscount = statuscount + 1;
			}		
		}
		
		System.out.println("No of employees Enabled:" + statuscount);
		driver.close();

	}

}

//PIM -- > Employees List
// retrieve all the employee details from a table.