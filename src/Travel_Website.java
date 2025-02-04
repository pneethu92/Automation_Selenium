import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travel_Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neeth\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
        WebElement policy = driver.findElement(By.id("onetrust-close-btn-container"));
        policy.click();
        driver.findElement(By.xpath("(//a[@ class='uitk-tab-anchor'])[1]")).click();
        driver.findElement(By.xpath("//span[@ class='uitk-tab-text'])")).click();
        driver.findElement(By.xpath("(//a[@ class='uitk-tab-anchor'])[1]")).click();
        driver.findElement(By.xpath("//span[@ class='uitk-tab-text'])")).click();
        
        
        //WebElement from=driver.findElement(By.className("uitk-field-label"));
       //from.sendKeys("Stockholm");
        
	}

}
