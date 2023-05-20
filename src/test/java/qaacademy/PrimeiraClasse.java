package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosPresenciaisBotao = "comp-k7g9c7sd1label";
    String cursosOnlineBotao = "comp-k7g9c7sd2label";
    String botaoContato = "comp-k7g9c7sd3label";
    String botaoDepoimento = "comp-k7g9c7sd4label";
    String botaoMatricula = "comp-k7g9c7sd5label";
   
   
    
    @Test
    public void testeAberturaNavegador() throws InterruptedException{ 
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://qaacademy.com.br/");

       Thread.sleep(6000);
        drive.findElement(By.id(cursosOnlineBotao)).click();;
        Thread.sleep(6000);
        drive.findElement(By.id(cursosPresenciaisBotao)).click();;
        Thread.sleep(6000);
        drive.findElement(By.id(botaoContato)).click();;
        Thread.sleep(6000);
        drive.findElement(By.id(botaoDepoimento)).click();;
        Thread.sleep(6000);
        drive.findElement(By.id(botaoMatricula)).click();;
    }



}
