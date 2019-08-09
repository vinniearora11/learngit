package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(2000);
	String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		if(txt.contentEquals("Please select start place."))
				{
			driver.switchTo().alert().accept();
			System.out.println("correct");
				}
		else
			System.out.println("invalid alert");
		driver.close();  // this closes the browser
	}
}
	
		
		
		

	