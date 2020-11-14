import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login extends DadosCadastrais {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
		driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
					
	}

	
}


