package br.eduardacf.template.funcional;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.*;
import static br.eduardacf.template.constants.Mensagens.MESSAGE;
import static br.eduardacf.template.constants.Mensagens.MSG_PRODUTO_NAO_ENCONTRADO;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

public class ProdutosTest extends BaseInicial {

    @Test
    public void sucessoAoBuscarProdutoComIdValido() {
        String title = produtosClient.getBuscarUnicoProduto(ID_1)
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get(TITLE);
        assertEquals(title, IPHONE_9);
    }

    @Test
    public void falhaAoBuscarProdutoComIdInvalido() {
        String message = produtosClient.getBuscarUnicoProduto(ID_INVALIDO)
                .statusCode(SC_NOT_FOUND)
                .extract()
                .jsonPath()
                .get(MESSAGE);
        assertEquals(message, MSG_PRODUTO_NAO_ENCONTRADO);
    }
}
