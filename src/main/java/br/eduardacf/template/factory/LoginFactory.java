package br.eduardacf.template.factory;

import br.eduardacf.template.dto.LoginRequestDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginFactory {

    public static LoginRequestDTO buildLoginDTO(String username, String password) {
        return LoginRequestDTO
                .builder()
                .username(username)
                .password(password)
                .build();
    }

    public static LoginRequestDTO buildLoginComSucesso() {
        return buildLoginDTO("kminchelle", "0lelplR");
    }

    public static LoginRequestDTO buildLoginInvalido() {
        return buildLoginDTO("kminchelle", "0lelplXXXXXXXXX");
    }
}
