package modulos.produto;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import paginas.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Teste mobile do Módulo de Produto")
public class ProdutoTest {
    public WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_30");
        capabilities.setCapability("platform", "android");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.lojinha");
        capabilities.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capabilities.setCapability("app", "/home/bruno/Documents/personal/learnings/ptqs#2/mobile/Lojinha_Android_Nativa/lojinha-nativa.apk");

        app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void afterEach() { app.quit(); }

    @DisplayName("Validação do valor de produto não permitido")
    @Test
    public void testValidacaoDoValorDeProdutoNaoPermitido() {
        // Fazer Login
        String mensagemApresentada =  new LoginPage(app).
                preencherUsuarioESenha("admin", "admin").
                submeterFormularioComCredenciaisValidas().
                    adicionarProduto().
                        informarDadosProduto("PS", "800000", "Preto").
                        submeterComErro().
                        mensagemToast();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }
}
