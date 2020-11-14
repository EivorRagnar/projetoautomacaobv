import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logout extends DadosCadastrais{
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		driver.findElement(By.linkText("Seu Barriga")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contas")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Criar Movimentação")).click();
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Resumo Mensal")).click();
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sair")).click();
				
	}

}
