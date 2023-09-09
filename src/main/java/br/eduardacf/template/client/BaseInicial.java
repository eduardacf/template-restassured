package br.eduardacf.template.client;

import br.eduardacf.template.client.auth.AuthClient;
import br.eduardacf.template.client.produtos.ProdutosClient;
import io.restassured.specification.RequestSpecification;
import static br.eduardacf.template.spec.ServerSpecification.getRequestSpecification;

public abstract class BaseInicial {
    private final RequestSpecification spec = getRequestSpecification();
    protected HealthClient healthClient = new HealthClient(spec);
    protected AuthClient authClient = new AuthClient(spec);
    protected ProdutosClient produtosClient = new ProdutosClient(spec);

}
