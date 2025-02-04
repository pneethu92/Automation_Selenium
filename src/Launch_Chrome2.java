import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neeth\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement elm=driver.findElement(By.id("email"));
		elm.sendKeys("Neethu");
		WebElement e1=driver.findElement(By.id("pass"));
		e1.sendKeys("12345");
		WebElement L1=driver.findElement(By.id("loginbutton"));
		L1.click();

	}

}
