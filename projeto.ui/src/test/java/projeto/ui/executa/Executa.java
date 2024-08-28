package projeto.ui.executa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import projeto.ui.drivers.Drivers;

public class Executa extends Drivers {

	static String browser = "Chrome";
	/**
	 * Esse metodo abre o navegador escolhido (Chrome, Firefox ou Edge)
	 * @author Nilson
	 */
	
	
	public static void iniciarTeste() {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

}
