package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxTest {

	
		
public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.myntra.com/");
					
					driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("shoes");
					Thread.sleep(1500);
					driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[3]")).click();
		
		// TODO Auto-generated method stub

	}

}
