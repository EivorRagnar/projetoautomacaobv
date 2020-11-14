import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExclusaoDeConta extends DadosCadastrais{
	public static void main(String[] args) throws InterruptedException{
		//Acessando o Sistema
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		
		//Listar Contas
		driver.findElement(By.linkText("Contas")).click();
		driver.findElement(By.linkText("Listar")).click();
		
		//Exclusão de Contas
		driver.findElement(By.cssSelector("tr:nth-child(1) .glyphicon-remove-circle")).click();
	    driver.findElement(By.cssSelector(".glyphicon-remove-circle")).click();
		
	}

}
