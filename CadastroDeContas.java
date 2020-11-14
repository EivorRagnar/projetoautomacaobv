import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class CadastroDeContas extends DadosCadastrais{
			public static void main(String[] args) throws InterruptedException{
			
			//Acessando o Sistema e criando uma conta
			WebDriver driver = new FirefoxDriver();
			driver.get("https://seubarriga.wcaquino.me/contas");
			driver.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
			driver.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
			driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
			driver.findElement(By.linkText("Contas")).click();
		    driver.findElement(By.linkText("Adicionar")).click();
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys(deveRetornarUmaConta());
		    driver.findElement(By.cssSelector(".btn")).click();
		   		    		    
		  //Acessando o Sistema e criando outra conta
			WebDriver driver2  = new FirefoxDriver();
			driver2.get("https://seubarriga.wcaquino.me/contas");
			driver2.findElement(By.name("email")).sendKeys(deveRetornarUmEmail());
			driver2.findElement(By.name("senha")).sendKeys(deveRetornarUmaSenha());
			driver2.findElement(By.xpath("/html/body/div[2]/form/button")).click();
			driver2.findElement(By.linkText("Contas")).click();
		    driver2.findElement(By.linkText("Adicionar")).click();
		    driver2.findElement(By.id("nome")).click();
		    driver2.findElement(By.id("nome")).sendKeys(deveRetornarUmaConta2());
		   	driver2.findElement(By.cssSelector(".btn")).click();
		    		    	    		  	
		    
		}
								
}