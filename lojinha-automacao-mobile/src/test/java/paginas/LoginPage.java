package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver app) {
        super(app);
    }

    public LoginPage preencherUsuarioESenha(String usuario, String senha) {
        app.
            findElement(By.id("com.lojinha:id/user")).
            findElement(By.id("com.lojinha:id/editText")).
            sendKeys(usuario);

        app.
            findElement(By.id("com.lojinha:id/password")).
            findElement(By.id("com.lojinha:id/editText")).
            sendKeys(senha);

        return this;
    }

    public ListaDeProdutosPage submeterFormularioComCredenciaisValidas() {
        app.findElement(By.id("com.lojinha:id/loginButton")).click();
        return new ListaDeProdutosPage(app);
    }
}
