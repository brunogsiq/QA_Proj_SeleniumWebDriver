package treinamento_automacao;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Main
	{
		public static void main(String[] args) throws InterruptedException 
		{
			//sysout + ctrl + backspace.
			System.out.println("Vai Corinthians");
			System.out.println("Campeão dos campeões");
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			//Visitando uma página.
			driver.get("https://www.google.com.br");
			//Instrução busca do elemento + Inserindo dados em um campo input.
			driver.findElement(By.name("q")).sendKeys("Sport Club Corinthians Paulista");
			//Instrução aguarda um tempo.
			Thread.sleep(3000);
			driver.findElement(By.name("btnI")).click();
		}
	
		public static void teste_01(String[] args) throws InterruptedException 
		{
			String cTitleMain = "Este domínio está disponível para venda.";
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.bookazon.com");
			Thread.sleep(5000);
			cTitleMain = driver.findElement(By.className(".godaddy-branded > div > h5")).getText();
			
			if(cTitleMain.equals(cTitleMain) )
			{
				System.out.println("Validação realizada com SUCESSO.");
			}
			else
			{
				System.out.println("Validação realizada com FALHA.");
			}
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                // Salvar a captura de tela em um arquivo
                FileUtils.copyFile(screenshotFile, new File("D:\\GitHub\\QA_Learn\\Selenium Web Driver\\01_Project\\treinamento_automacao\\screenshootscreenshot.png"));
                System.out.println("Captura de tela salva com sucesso.");
            } 
            catch (Exception e) 
            {
                System.out.println("Ocorreu um erro ao salvar a captura de tela: " + e.getMessage());
            }
		}
		
		public static void teste_02(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			//Visitando uma página.
			driver.get("http://www.bookazon.com");
			Thread.sleep(5000);
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#firstName")).sendKeys("Bruno");
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#lastName")).sendKeys("Siqueira");
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#email")).sendKeys("brunogsiq@gmail.com");
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#phone")).sendKeys("48991059871");
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#country_dropdown")).sendKeys("Brasil");
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.className(".recaptcha-checkbox-border")).click();
			//Instrução busca do elemento + Tipo de Elemento + Elemento.
			driver.findElement(By.id("#submitForm")).click();		
		}
	}


