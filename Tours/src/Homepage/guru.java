package Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class guru {

	public static void main(String[] args) {
	
		
		

			

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://www.facebook.com/");
			    
			    List<WebElement> elements = driver.findElements(By.name("name"));
			    System.out.println("Number of elements:" +elements.size());

			    for (int i=0; i<elements.size();i++){
			      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
			    }
			  }

	}


