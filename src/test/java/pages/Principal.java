package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Principal {
    static WebDriver driver;
    static WebDriverWait wait;

    public Principal(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherCampo(){

        WebElement nome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-nome")));
        nome.sendKeys("Vitor Alicer");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-email")));
        email.sendKeys("vitoralicer@gmail.com");

        WebElement telefone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-telefone")));
        telefone.sendKeys("51985050680");

        WebElement cpf = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-cpf")));
        cpf.sendKeys("85916803087");

        WebElement cidade = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-cidade")));
        cidade.sendKeys("Porto Alegre");
        cidade.click();

        WebElement solicitacao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-solicitacao")));
        solicitacao.sendKeys("Dúvida");
        solicitacao.click();

        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-mensagem")));
        mensagem.sendKeys("Prezados, gostaria de mais informações sobre o curso de Análise e Desenvolvimento de Sistemas.");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Pronto, quero enviar a mensagem')]"));
        botaoAvancar.click();


    }
}
