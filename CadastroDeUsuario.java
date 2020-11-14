import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroDeUsuario extends DadosCadastrais {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/cadastro");
		driver.findElement(By.xpath("//input[@id='nome']")).sendKeys(deveRetornarUmNome());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.xpath("//input[@id='senha']")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
	driver.quit();
		
	}
		
}

