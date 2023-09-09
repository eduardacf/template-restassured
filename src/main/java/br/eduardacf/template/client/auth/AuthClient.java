package br.eduardacf.template.client.auth;

import br.eduardacf.template.dto.request.LoginRequestDTO;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static br.eduardacf.template.constants.Endpoints.AUTH_LOGIN;
import static io.restassured.RestAssured.given;

public class AuthClient {

    private final RequestSpecification requestSpec;

    public AuthClient(RequestSpecification specification) {
        this.requestSpec = specification;
    }

    public ValidatableResponse postLogin(LoginRequestDTO loginRequestDTO) {
        return given()
                .accept(ContentType.JSON)
                .spec(requestSpec)
                .body(loginRequestDTO)
                .when()
                .post(AUTH_LOGIN)
                .then();
    }
}
