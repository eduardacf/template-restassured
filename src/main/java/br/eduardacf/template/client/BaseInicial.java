package br.eduardacf.template.client;

import io.restassured.specification.RequestSpecification;
import static br.eduardacf.template.spec.ServerSpecification.getRequestSpecification;

public abstract class BaseInicial {
    private final RequestSpecification spec = getRequestSpecification();
    protected HealthClient healthClient = new HealthClient(spec);
}
