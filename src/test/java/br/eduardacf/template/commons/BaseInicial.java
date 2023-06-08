package br.eduardacf.template.commons;

import br.eduardacf.template.client.HealthClient;
import br.eduardacf.template.spec.ServerRestSpecification;

public class BaseInicial {
  protected ServerRestSpecification serveRestSpecification = new ServerRestSpecification();
  protected HealthClient healthClient = new HealthClient(serveRestSpecification.getRequestSpecification());
}
