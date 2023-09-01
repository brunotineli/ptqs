package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutosPage {
    private WebDriver navegador;

    public ProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ProdutosPage informarDadosProduto(String produtoNome, String produtoValor, String produtoCores) {
        navegador.findElement(By.id("produtonome")).sendKeys("Auto web");
        navegador.findElement(By.id("produtovalor")).sendKeys("0");
        navegador.findElement(By.id("produtocores")).sendKeys("Preto");
        return this;
    }

    public ListaDeProdutosPage submeterCadastroProduto() {
        navegador.findElement(By.cssSelector("button[type='submit']")).click();
        return new ListaDeProdutosPage(navegador);
    }
}
