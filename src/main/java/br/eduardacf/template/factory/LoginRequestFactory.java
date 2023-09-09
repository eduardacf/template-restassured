package br.eduardacf.template.factory;

import br.eduardacf.template.dto.request.LoginRequestDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static br.eduardacf.template.constants.auth.Auth.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginRequestFactory {

    public static LoginRequestDTO buildLoginDTO(String username, String password) {
        return LoginRequestDTO
                .builder()
                .username(username)
                .password(password)
                .build();
    }

    public static LoginRequestDTO buildLoginComSucesso() {
        return buildLoginDTO(USERNAME_VALIDO, SENHA_VALIDA);
    }

    public static LoginRequestDTO buildLoginInvalido() {
        return buildLoginDTO(USERNAME_VALIDO, SENHA_INVALIDA);
    }
}
