package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage {
    private WebDriver navegador;

    public ListaDeProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ProdutosPage adicionarProduto() {
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
        return new ProdutosPage(navegador);
    }

    public String mensagemToast() {
        return this.navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
