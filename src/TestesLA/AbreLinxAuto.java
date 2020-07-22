package TestesLA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AbreLinxAuto {
	@Test
	public void DeveLogar() {
	//Referenciar o chrome como navegador e apontar para o driver do mesmo
	//Caso o navegador escolhido para o teste seja outro, como ex. Mozilla, lembre de fazer esse mesmo procedimento com ele.
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//criar uma variavel do tipo, e colocar dentro da varivael um novo objeto do tipo do navegador
	driver.get(""); //Aqui informa a url do sistema
	
	WebElement botaoLogin = driver.findElement(By.id("")); //Guarda o elemento que existe na tela para ir pro login
	botaoLogin.click();
	
	//Pegar o elemento de nome e senha
	WebElement idLogin = driver.findElement(By.id("")); //identifica o elemento que recebe o usuário
	WebElement idSenha = driver.findElement(By.id("")); //identifica o elemento que recebe a senha
	
	//Informar os dados nos respectivos campos
	idLogin.sendKeys(""); //Informa usuario
	idSenha.sendKeys(""); //Informa a senha
	
	//Acessar o LA
	WebElement botaoEntrar = driver.findElement(By.id("")); //identifica o elemento de submeter
	botaoEntrar.click(); //Clica no elemento que acessa o sistema
	
	//Validar se deu certo
	boolean logou = driver.getPageSource().contains(""); //informa algum dado que 
	assertTrue(logou); //Valida que o teste passou
	
	}
}
