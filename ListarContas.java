import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListarContas extends DadosCadastrais {
	public static void main(String[] args) throws InterruptedException{
		
		//Acessando o Sistema
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/contas");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		
		//Listar Contas
		driver.findElement(By.linkText("Contas")).click();
	    driver.findElement(By.linkText("Listar")).click();
		
	}

}
