package modulos.produto;

import DataFactory.ProdutoDataFactory;
import DataFactory.UsuarioDataFactory;
import Pojo.UsuarioPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de API Rest do módulo de produto")
public class    ProdutoTest {
    private String token;

    @BeforeEach
    public void beforeEach() {
        baseURI = "http://165.227.93.41";
        port = 80;
        basePath = "/lojinha";

        this.token = given()
                        .contentType(ContentType.JSON)
                        .body(UsuarioDataFactory.usuarioAdmin())
                    .when()
                        .post("/v2/login")
                    .then()
                        .extract()
                            .path("data.token");
    }

    @Test
    @DisplayName("Validar que o valor 0,00 é proibido")
    public void testValidarLimiteValorZeradoProibido() {
        given()
            .contentType(ContentType.JSON)
            .header("token", token)
            .body(ProdutoDataFactory.adicionarProdutoComumComValorDe(0.00))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat().statusCode(422)
            .assertThat().body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"));
    }

    @Test
    @DisplayName("Validar que o valor 7000,01 é proibido")
    public void testValidarLimiteValorSeteMilProibido() {
        given()
            .contentType(ContentType.JSON)
            .header("token", token)
            .body(ProdutoDataFactory.adicionarProdutoComumComValorDe(7000.01))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat().statusCode(422)
            .assertThat().body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"));
    }
}
