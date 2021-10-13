package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandoBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		comandosBrowser();
		
	}
	
	public static void comandosBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String codigoFonte = driver.getPageSource();
		//System.out.println(codigoFonte);
		
		driver.close();
		
	}

}
