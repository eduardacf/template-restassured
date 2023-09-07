package br.eduardacf.template.aceitação;

import br.eduardacf.template.client.BaseInicial;
import br.eduardacf.template.dto.LoginResponseDTO;
import br.eduardacf.template.factory.LoginFactory;
import org.testng.annotations.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AuthTest extends BaseInicial {

    @Test
    public void sucessoAoFazerLogin() {
        LoginResponseDTO loginResponseDTO = authClient.postLogin(LoginFactory.buildLoginComSucesso())
                .statusCode(SC_OK)
                .extract()
                .as(LoginResponseDTO.class);

        assertEquals(loginResponseDTO.getId(),15);
        assertEquals(loginResponseDTO.getUsername(),"kminchelle");
        assertEquals(loginResponseDTO.getEmail(),"kminchelle@qq.com");
        assertNotNull(loginResponseDTO.getToken());

    }

}