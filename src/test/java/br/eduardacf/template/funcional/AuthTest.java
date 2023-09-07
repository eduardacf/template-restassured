package br.eduardacf.template.funcional;

import br.eduardacf.template.client.BaseInicial;
import br.eduardacf.template.dto.LoginResponseDTO;

import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.*;
import static br.eduardacf.template.factory.LoginFactory.buildLoginComSucesso;
import static br.eduardacf.template.factory.LoginFactory.buildLoginInvalido;
import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AuthTest extends BaseInicial {
    @Test
    public void sucessoAoFazerLogin() {
        LoginResponseDTO loginResponseDTO = authClient.postLogin(buildLoginComSucesso())
                .statusCode(SC_OK)
                .extract()
                .as(LoginResponseDTO.class);

        assertEquals(loginResponseDTO.getId(), ID_VALIDO);
        assertEquals(loginResponseDTO.getUsername(), USERNAME_VALIDO);
        assertEquals(loginResponseDTO.getEmail(), EMAIL_VALIDO);
        assertNotNull(loginResponseDTO.getToken());
    }

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
