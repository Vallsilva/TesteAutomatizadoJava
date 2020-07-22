package TestesLA;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SelecionaRegistroDeCompra {

	private ChromeDriver driver;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		AbreLinxAuto abrir = new AbreLinxAuto();
		abrir.DeveLogar();
	}
	@Test
	public void DeveAcessarRegistroDeCompra() {
		WebElement veiculo = driver.findElement(By.linkText("Veículos"));
		veiculo.click();
	}
	
}
