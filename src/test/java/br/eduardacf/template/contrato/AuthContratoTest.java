package br.eduardacf.template.contrato;

import br.eduardacf.template.client.BaseInicial;
import br.eduardacf.template.dto.LoginResponseDTO;
import org.testng.annotations.Test;

import java.io.File;

import static br.eduardacf.template.constants.Gerais.*;
import static br.eduardacf.template.factory.LoginFactory.buildLoginComSucesso;
import static br.eduardacf.template.factory.LoginFactory.buildLoginInvalido;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AuthContratoTest extends BaseInicial {
    @Test
    public void sucessoAoRetornarContratoSchemaAuthFazerLogin() {
        authClient.postLogin(buildLoginComSucesso())
                .statusCode(SC_OK)
                .body(matchesJsonSchema(new File("src/main/resources/contratos-json/contrato_postAuth.json")));
    }
}
