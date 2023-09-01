package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage extends BasePage {
    public ListaDeProdutosPage(WebDriver app) {
        super(app);
    }

    public ProdutosPage adicionarProduto() {
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new ProdutosPage(app);
    }
}
