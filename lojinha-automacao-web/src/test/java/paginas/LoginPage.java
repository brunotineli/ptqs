package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.log.Log;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage preencherUsuarioESenha(String usuario, String senha) {
        navegador.findElement(By.id("usuario")).sendKeys("admin");
        navegador.findElement(By.id("senha")).sendKeys("admin");
        return this;
    }

    public ListaDeProdutosPage submeterFormularioComCredenciaisValidas() {
        navegador.findElement(By.cssSelector("button[type='submit']")).click();
        return new ListaDeProdutosPage(navegador);
    }
}
