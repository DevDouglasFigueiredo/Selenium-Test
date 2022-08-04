package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrandoSteps {

    WebDriver driver = new ChromeDriver();
    @Dado("^que estou no site do Pessoni$")
    public void que_estou_no_site_do_Pessoni(){
        driver.get("https://viniciuspessoni.com/comunidade-tester-global-b/");
    }

    @Quando("^eu preencho meu nome$")
    public void eu_preencho_meu_nome(){
        driver.findElement(By.id("mce-FNAME")).sendKeys("Douglas Figueiredo");
    }

    @Quando("^meu email$")
    public void meu_email(){
        driver.findElement(By.cssSelector(".email")).sendKeys("douglasbuss@hotmail.com");
    }

    @Quando("^clico em inscrever$")
    public void clico_em_inscrever(){
        driver.findElement(By.id("mc-embedded-subscribe")).click();
    }

    @Entao("^devo ser redirecionado para uma tela de confirmação de cadastro$")
    public void devo_ser_redirecionado_para_uma_tela_de_confirmação_de_cadastro(){

    }
}
