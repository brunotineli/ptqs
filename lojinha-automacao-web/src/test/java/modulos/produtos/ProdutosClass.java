package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.ListaDeProdutosPage;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes web do módulo de produtos")
public class ProdutosClass {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        navegador = new ChromeDriver();

        // Maximizar a tela e configurar espera padrão
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navegar para lojinha web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");
    }

    @AfterEach
    public void afterEach() {
        navegador.quit();
    }

    @Test
    @DisplayName("Não é permitido registrar produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualaZero() {
        String mensagem = new LoginPage(navegador)
                .preencherUsuarioESenha("admin", "admin")
                .submeterFormularioComCredenciaisValidas()
                    .adicionarProduto()
                        .informarDadosProduto(
                                "Plastation 1",
                                "000",
                                "Preto, Branco")
                            .submeterCadastroProduto()
                                .mensagemToast();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagem);
    }

    @Test
    @DisplayName("Não é permitido registrar produto com valor maior que 7000,00")
    public void testNaoEPermitidoRegistrarProdutoComValorMaiorQueSeteMil() {
        String mensagem = new LoginPage(navegador)
                .preencherUsuarioESenha("admin", "admin")
                .submeterFormularioComCredenciaisValidas()
                .adicionarProduto()
                .informarDadosProduto(
                        "Plastation 5",
                        "12345678",
                        "Preto, Branco")
                .submeterCadastroProduto()
                .mensagemToast();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagem);
    }
}
