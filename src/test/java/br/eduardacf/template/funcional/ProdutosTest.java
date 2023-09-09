package br.eduardacf.template.funcional;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.*;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

public class ProdutosTest extends BaseInicial {
    @Test
    public void sucessoAoBuscarProdutoComIdValido() {
        String title = produtosClient.getBuscarUnicoProduto("1")
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get("title");
        assertEquals(title, "iPhone 9");
    }

    @Test
    public void falhaAoBuscarProdutoComIdInvalido() {
        String message = produtosClient.getBuscarUnicoProduto("11111111")
                .statusCode(SC_NOT_FOUND)
                .extract()
                .jsonPath()
                .get(MESSAGE);
        assertEquals(message, MSG_PRODUTO_NAO_ENCONTRADO);
    }
}
