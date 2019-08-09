package Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		
		 int count= gender.size();
		 System.out.println("the number is"+ count);
		 
		 for( int i=0; i<count; i++) {
			  String txt = gender.get(i).getText();
			  System.out.println(txt);
			  gender.get(i).click();
			  Thread.sleep(1000);
			 
			 
		 }

	}

}
