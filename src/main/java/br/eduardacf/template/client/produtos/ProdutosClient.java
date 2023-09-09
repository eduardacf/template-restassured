package br.eduardacf.template.client.produtos;

import br.eduardacf.template.dto.request.TituloRequestDTO;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static br.eduardacf.template.constants.Endpoints.*;
import static br.eduardacf.template.constants.Gerais.ID_PRODUTO;
import static io.restassured.RestAssured.given;

public class ProdutosClient {

    private final RequestSpecification requestSpec;

    public ProdutosClient(RequestSpecification specification) {
        this.requestSpec = specification;
    }

    public ValidatableResponse buscarUnicoProduto(String idProduto) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .when()
                .pathParam(ID_PRODUTO, idProduto)
                .get(BUSCAR_PRODUTO_COM_UNICO_ID)
                .then();
    }

    public ValidatableResponse adicionaProduto(TituloRequestDTO tituloRequestDTO) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .when()
                .body(tituloRequestDTO)
                .post(ADICIONAR_PRODUTO)
                .then();
    }

    public ValidatableResponse alteraProduto(String idProduto, TituloRequestDTO tituloRequestDTO) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .when()
                .body(tituloRequestDTO)
                .pathParam(ID_PRODUTO, idProduto)
                .put(ALTERAR_PRODUTO_POR_ID)
                .then();
    }

    public ValidatableResponse deletaProduto(String idProduto) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .when()
                .pathParam(ID_PRODUTO, idProduto)
                .delete(DELETAR_PRODUTO_POR_ID)
                .then();
    }
}
