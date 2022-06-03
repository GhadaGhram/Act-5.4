package progSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1 {

	

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");	
    WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
   
    driver.navigate().to("http://demo.guru99.com/test/newtours/");
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("firstName")).sendKeys("Ghada");
    driver.findElement(By.name("lastName")).sendKeys("Ghram");
    driver.findElement(By.name("phone")).sendKeys("99737510");
    driver.findElement(By.name("userName")).sendKeys("ghadaa.ghram@gmail.com");
    driver.findElement(By.name("address1")).sendKeys("Charguia");
    driver.findElement(By.name("city")).sendKeys("Tunis");
    driver.findElement(By.name("state")).sendKeys("Tunisie");
    driver.findElement(By.name("postalCode")).sendKeys("2040");
    
    
    Select drpCountry= new Select(driver.findElement(By.name("country")));
    drpCountry.selectByVisibleText("TUNISIA");
    
    driver.findElement(By.name("emaiil")).sendKeys("ghadaa.ghram@gmail.com");
    driver.findElement(By.name("password")).sendKeys("allo+123456789");
    driver.findElement(By.name("confirmPassword")).sendKeys("allo+123456789");
    driver.findElement(By.name("submit")).click();
   
     /* List<WebElement> listOfElements = driver.findElements(By.name(ForAbstractMethod (int i )));
   listOfElements.sendkeys("ghada","ghram","99737510","ghadaa.ghram@gmail.com");*/
    driver.close(); 

	}

}
