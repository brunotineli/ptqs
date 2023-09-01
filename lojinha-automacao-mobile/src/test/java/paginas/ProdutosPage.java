package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutosPage extends BasePage {
    public ProdutosPage(WebDriver app) {
        super(app);
    }

    public ProdutosPage informarDadosProduto(String produtoNome, String produtoValor, String produtoCores) {
        app.
                findElement(By.id("com.lojinha:id/productName")).
                findElement(By.id("com.lojinha:id/editText")).
                sendKeys(produtoNome);
        app.
                findElement(By.id("com.lojinha:id/productValue")).
                findElement(By.id("com.lojinha:id/editText")).
                sendKeys(produtoValor);
//        app.
//            findElement(By.id("com.lojinha:id/productColors")).
//            findElement(By.id("com.lojinha:id/editText")).
//            sendKeys(produtoCores);
        return this;
    }

    public ProdutosPage submeterComErro() {
        app.findElement(By.id("com.lojinha:id/saveButton")).click();
        return this;
    }

    public String mensagemToast() {
        return capturarToast();
    }
}
