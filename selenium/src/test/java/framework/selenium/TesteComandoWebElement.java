package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandoWebElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void webElement() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	}

}
