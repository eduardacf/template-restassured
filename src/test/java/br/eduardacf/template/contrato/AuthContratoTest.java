package br.eduardacf.template.contrato;

import br.eduardacf.template.client.BaseInicial;
import org.testng.annotations.Test;

import java.io.File;

import static br.eduardacf.template.factory.LoginRequestFactory.buildLoginComSucesso;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AuthContratoTest extends BaseInicial {
    @Test
    public void sucessoAoRetornarContratoSchemaAuthFazerLogin() {
        authClient.realizaLogin(buildLoginComSucesso())
                .statusCode(SC_OK)
                .body(matchesJsonSchema(new File("src/main/resources/contratos-json/contrato_postAuth.json")));
    }
}
