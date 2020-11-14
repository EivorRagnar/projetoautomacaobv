import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtratoDeContaCorrente extends DadosCadastrais{
	public static void main(String[] args) throws InterruptedException{
		
		//Acessando o Sistema e buscando o Extrato de conta corrente
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		
		driver.get("https://seubarriga.wcaquino.me/extrato");
	    driver.findElement(By.cssSelector("#mes > option:nth-child(11)")).click();
	    driver.findElement(By.cssSelector("#ano > option:nth-child(11)")).click();
	    driver.findElement(By.cssSelector(".btn")).click();
	    		
	}
		
}
