package br.eduardacf.template.funcional;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.*;
import static br.eduardacf.template.constants.Mensagens.MESSAGE;
import static br.eduardacf.template.constants.Mensagens.MSG_PRODUTO_NAO_ENCONTRADO;
import static br.eduardacf.template.factory.TituloRequestFactory.buildTituloAdicionadoComSucesso;
import static br.eduardacf.template.factory.TituloRequestFactory.buildTituloAlteradoComSucesso;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ProdutoTest extends BaseInicial {



    @Test
    public void sucessoAoBuscarProduto() {
        String title = produtosClient.buscarUnicoProduto(ID_1)
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get(TITLE);
        assertEquals(title, IPHONE_9);
    }

    @Test
    public void falhaAoBuscarProdutoComIdInvalido() {
        String message = produtosClient.buscarUnicoProduto(ID_INVALIDO)
                .statusCode(SC_NOT_FOUND)
                .extract()
                .jsonPath()
                .get(MESSAGE);
        assertEquals(message, MSG_PRODUTO_NAO_ENCONTRADO);
    }

    @Test
    public void sucessoAoAdicionarProduto() {
        int id = produtosClient.adicionaProduto(buildTituloAdicionadoComSucesso())
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get(ID);
        assertEquals(id, 101);
    }

    @Test
    public void sucessoAoAlterarProduto() {
        String title = produtosClient.alteraProduto("1",buildTituloAlteradoComSucesso())
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get(TITLE);
        assertEquals(title, TITULO_ALTERADO);
    }
    @Test
    public void sucessoAoDeletarProduto() {
        boolean isDeleted = produtosClient.deletaProduto(String.valueOf(1))
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .get(IS_DELETED);
        assertTrue(isDeleted);
    }
}
