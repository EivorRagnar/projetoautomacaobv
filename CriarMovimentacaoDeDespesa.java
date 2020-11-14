import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CriarMovimentacaoDeDespesa extends DadosCadastrais {
	public static void main(String[] args) throws InterruptedException{
		
		//Fazendo Login
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		
		//Criando movimentação de Despesa
		driver.get("https://seubarriga.wcaquino.me/movimentacao");
	    WebElement dropdown = driver.findElement(By.id("tipo"));
	    dropdown.findElement(By.xpath("//option[. = 'Despesa']")).click();
	    driver.findElement(By.id("data_transacao")).sendKeys("14/11/2020");
	    driver.findElement(By.id("data_pagamento")).sendKeys("14/11/2020");
	    driver.findElement(By.id("descricao")).sendKeys("Comprando PS5");
	    driver.findElement(By.id("interessado")).sendKeys(deveRetornarUmNome());
	    driver.findElement(By.id("valor")).sendKeys("5000");
	    driver.findElement(By.cssSelector("#conta > option:nth-child(2)")).click();
	    driver.findElement(By.id("status_pago")).click();
	    driver.findElement(By.cssSelector(".btn")).click();
	    
	}
	
	public void validarCadastroDeExtrato() {
		WebDriver driver = new FirefoxDriver();
		String verifica = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		  if (verifica != null) {
			System.out.println("Movimentação adicionada com sucesso!");
		} else {
			System.out.println("Movimentação Não Inserida!");
		}
	}

}
