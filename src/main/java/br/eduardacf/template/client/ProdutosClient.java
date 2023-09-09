package br.eduardacf.template.client;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static br.eduardacf.template.constants.Endpoints.BUSCAR_PRODUTO_COM_UNICO_ID;
import static io.restassured.RestAssured.given;

public class ProdutosClient {

    private final RequestSpecification requestSpec;

    public ProdutosClient(RequestSpecification specification) {
        this.requestSpec = specification;
    }

    public ValidatableResponse getBuscarUnicoProduto(String idProduto) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .when()
                .pathParam("idProduto",idProduto)
                .get(BUSCAR_PRODUTO_COM_UNICO_ID)
                .then();
    }
}
