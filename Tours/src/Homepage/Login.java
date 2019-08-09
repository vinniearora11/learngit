package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.By;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait my =new WebDriverWait(driver,10000);// explixit wait use special class webdriverwait
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  // implict wait 
		
		driver.get("https://www.facebook.com/");
		WebElement Unm = my.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		 Unm.sendKeys("vinniearora11@gmail.com");
		 
		 WebElement pwd = driver.findElement(By.id("pass"));
		 pwd.sendKeys("Kamalarora");
		 
		 WebElement log = driver.findElement(By.id("loginbutton"));
		 log.click();
		
		 //driver.findElement(By.linkText("Data Policy")).click();
		 

		 
		 
		 
		 
		 
		 	

	}

}
