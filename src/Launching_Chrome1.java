

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");


	}

}
