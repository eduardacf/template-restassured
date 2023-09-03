package br.eduardacf.template.client;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static br.eduardacf.template.constants.Endpoints.TEST;
import static io.restassured.RestAssured.given;

public class HealthClient {

    private final RequestSpecification requestSpecification;

    public HealthClient(RequestSpecification specification) {
        this.requestSpecification = specification;
    }

    public ValidatableResponse getHealth() {
        return given().spec(requestSpecification)
                .when()
                .get(TEST)
                .then();
    }
}
