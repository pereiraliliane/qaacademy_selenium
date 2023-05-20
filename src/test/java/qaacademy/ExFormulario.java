package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFormulario {

    @Test
    public void preencherNome() throws InterruptedException{
        String nome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String sobrenome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
        String endereço = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
        String email = "//*[@id='eid']/input";
        String telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";

        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(6000);
        drive.findElement(By.xpath(nome)).click();
        drive.findElement(By.xpath(nome)).sendKeys("Liliane");
        drive.findElement(By.xpath(sobrenome)).click();
        drive.findElement(By.xpath(sobrenome)).sendKeys("Pereira");
        drive.findElement(By.xpath(endereço)).click();
        drive.findElement(By.xpath(endereço)).sendKeys("Rua da Chacara,11");
        drive.findElement(By.xpath(email)).click();
        drive.findElement(By.xpath(email)).sendKeys("liliklima34@gmail.com");
        drive.findElement(By.xpath(telefone)).click();
        drive.findElement(By.xpath(telefone)).sendKeys("11965294568");

        


    }    
}
