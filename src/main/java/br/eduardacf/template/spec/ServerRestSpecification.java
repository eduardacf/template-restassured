package br.eduardacf.template.spec;

import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;

import br.eduardacf.template.utils.PropertiesUtils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;

public class ServerRestSpecification {

  private static RequestSpecBuilder requestSpecBuilder() {
    return new RequestSpecBuilder().setConfig(new RestAssuredConfig()
            .sslConfig(new SSLConfig().relaxedHTTPSValidation())
            .logConfig(logConfig().enablePrettyPrinting(true)
                .enableLoggingOfRequestAndResponseIfValidationFails(ALL)))
        .setRelaxedHTTPSValidation()
        .setContentType(JSON)
        .setAccept(JSON)
        .log(ALL);
  }

  public RequestSpecification getRequestSpecification() {
    return requestSpecBuilder().setContentType(JSON)
        .setAccept(JSON)
        .setBaseUri(PropertiesUtils.getBaseUrl("base_url"))
        .build();
  }
}
