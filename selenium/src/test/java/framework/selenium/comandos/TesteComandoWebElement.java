package framework.selenium.comandos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandoWebElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		webElement();

	}
	
	public static void webElement() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\94\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("natalia@email.com");
		
		driver.findElement(By.id("email")).clear();
		
		boolean apareceu;
		
		apareceu = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(apareceu);
		
		boolean habilitado;
		
		habilitado = driver.findElement(By.id("email")).isEnabled();
		System.out.println(habilitado);
		
		driver.findElement(By.id("loginbutton")).submit();
		
		String textoDoLink;
		textoDoLink = driver.findElement(By.linkText("Forgot Password?")).getText();
		System.out.println(textoDoLink);
		
			
	}

}
