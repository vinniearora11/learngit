package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {

	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/");
					
					//WebElement img = driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']"));
					
					//System.out.println(img.isDisplayed());
					//System.out.println(img.isEnabled());
					//System.out.println(img.isSelected());
					
					//WebElement unm = driver.findElement(By.id("email"));
				    //unm.sendKeys("vinniearora11");
				    //Thread.sleep(2000);
					//unm.clear();
					//unm.sendKeys("vinniearora11@gmail.com");
				   // driver.close();
				   // WebElement pwd = driver.findElement(By.name("pass")); 
				    //pwd.sendKeys("sendtext");
				    //Thread.sleep(1000);
				    
				   driver.findElement(By.cssSelector("#u_0_l")).sendKeys("vinnie"); //using css selector
					
					
				
					

	}

}
