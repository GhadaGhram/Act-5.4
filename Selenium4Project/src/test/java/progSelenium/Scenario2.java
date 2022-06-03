package progSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario2 {

	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");	
		    WebDriver driver= new ChromeDriver();
		    
			driver.manage().window().maximize();
			
		   
		    driver.navigate().to("http://demo.guru99.com/test/newtours/");
		    driver.findElement(By.linkText("SIGN-ON")).click();
		    driver.findElement(By.name("userName")).sendKeys("ghadaa.ghram@gmail.com");
		    driver.findElement(By.name("password")).sendKeys("allo+123456789");
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		    driver.findElement(By.name("submit")).click();
		    driver.close(); 

	}
	
	

}
