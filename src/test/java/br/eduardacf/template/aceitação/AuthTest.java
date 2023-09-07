package br.eduardacf.template.aceitação;

import br.eduardacf.template.client.BaseInicial;
import br.eduardacf.template.dto.LoginResponseDTO;
import br.eduardacf.template.factory.LoginFactory;
import org.testng.annotations.Test;

import static br.eduardacf.template.constants.Gerais.*;
import static br.eduardacf.template.factory.LoginFactory.buildLoginComSucesso;
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
}