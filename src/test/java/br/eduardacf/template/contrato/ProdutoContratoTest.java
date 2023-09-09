package br.eduardacf.template.contrato;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.apache.http.HttpStatus.SC_OK;

public class ProdutoContratoTest extends BaseInicial {
    @Test
    public void sucessoAoRetornarContratoSchemaBuscarUnicoProdutoPorId() {
        produtosClient.buscarUnicoProduto("1")
                .statusCode(SC_OK)
                .body(matchesJsonSchema(new File("src/main/resources/contratos-json/contrato_getProdutoId.json")));
    }
}
