package projeto.ui.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import projeto.ui.drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar (By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void validarTexto(By elemento, String textoEsperado ) {
		
		String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoCapturado, textoEsperado);
	}
	
}
