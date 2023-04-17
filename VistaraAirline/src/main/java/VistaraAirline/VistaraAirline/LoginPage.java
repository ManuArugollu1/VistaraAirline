package VistaraAirline.VistaraAirline;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
	
    static String url = "https://www.airvistara.com/in/en";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manu\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");	
		ChromeOptions showNotify = new ChromeOptions();
		showNotify.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(showNotify);
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
				
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.out.println(driver.findElement(By.xpath("//button[@class='col-xs-12 aubergine-button-dark']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//input[@value='mv']")).getText());
		
		
		//driver.findElement(By.xpath("//button[@class='col-xs-12 aubergine-button-dark']")).click();
				
		/*driver.findElement(By.xpath("//a[@class='att_lightbox_close at-element-click-tracking']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Thread.sleep(2000);
				
		WebElement element =  driver.findElement(By.cssSelector("button[class='btn continue cookieContinue']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", element);
		
	      driver.findElement(By.cssSelector("input[name='flightSearchFrom']")).sendKeys("Delhi");
	      driver.findElement(By.cssSelector("input[name='flightSearchTo']")).sendKeys("Goa");
			
		*/
		
		
	      
		
		
		
	}

}
