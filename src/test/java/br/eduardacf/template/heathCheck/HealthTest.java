package br.eduardacf.template.heathCheck;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.is;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

public class HealthTest extends BaseInicial {
  @Test
  public void getHealthCheck() {
    healthClient.getHealth()
        .statusCode(SC_OK)
        .body("status", is("ok"));
  }
}
