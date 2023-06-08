package br.eduardacf.template.tests;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.is;

import br.eduardacf.template.commons.BaseInicial;
import org.testng.annotations.Test;

public class HealthTests extends BaseInicial {

  @Test
  public void getHealthCheck() {
    healthClient.getHealth()
        .statusCode(SC_OK)
        .body("status", is("ok"));
  }
}
