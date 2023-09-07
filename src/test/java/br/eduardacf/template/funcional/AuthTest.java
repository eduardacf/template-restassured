package br.eduardacf.template.funcional;

import br.eduardacf.template.client.BaseInicial;
import br.eduardacf.template.factory.LoginFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.MESSAGE;
import static br.eduardacf.template.constants.Gerais.MSG_INVALID_CREDENTIALS;
import static br.eduardacf.template.factory.LoginFactory.buildLoginInvalido;
import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.testng.AssertJUnit.assertEquals;

public class AuthTest extends BaseInicial {

    @Test
    public void falhaAoFazerLogin() {
        String message = authClient.postLogin(buildLoginInvalido())
                .statusCode(SC_BAD_REQUEST)
                .extract()
                .jsonPath()
                .get(MESSAGE);
        assertEquals(message, MSG_INVALID_CREDENTIALS);
    }
}
