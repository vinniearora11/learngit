package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINNIE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		String title= driver.getTitle();
		System.out.println("the title is "+title);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("back is done");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("forward is done");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("refresh is done");
		

	 }
}
	
	