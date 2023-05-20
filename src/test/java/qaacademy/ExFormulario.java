package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        String genero = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
        String hobbies = "//*[@id='checkbox2']";
        String habilidades = "//*[@id='Skills']";
        String opcaoJava = "//*[@id='Skills']/option[39]";
        String selecionarPais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span";
        String opcaoAustralia = "//*[@id='select2-country-container']";
       


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
        drive.findElement(By.xpath(genero)).click();
        drive.findElement(By.xpath(hobbies)).click();
        drive.findElement(By.xpath(habilidades)).click();
        JavascriptExecutor js = (JavascriptExecutor)drive ; 
        js.executeScript("window.scrollBy(0,400)", "");
        drive.findElement(By.xpath(opcaoJava)).click();
        drive.findElement(By.xpath(selecionarPais)).click();
        drive.findElement(By.xpath(opcaoAustralia)).click();
        


    }    
}
