package br.eduardacf.template.client;

import static br.eduardacf.template.constants.MainStaticValues.TEST;
import static io.restassured.RestAssured.given;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

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
